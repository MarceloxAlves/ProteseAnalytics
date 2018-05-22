package br.com.m2j.proteseanalytics.app;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.m2j.proteseanalytics.R;

public class MainActivity extends AppCompatActivity {

    private CallbackManager fbCallbackManager;
    private List<String> fbData;
    private ProgressDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FacebookSdk.sdkInitialize(getApplicationContext());
        fbCallbackManager = CallbackManager.Factory.create();
        fbData = new ArrayList<>();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        fbCallbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void realizarLogin(View view) {
        startActivity(new Intent(this, LoginPacienteActivity.class));
    }

    public void realizarCadastro(View view) {
        //ToDO::cadastro
        startActivity(new Intent(this,SiginChoseActivity.class));
    }

    public void autentificarComFacebook(View view) {
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile", "email"));
        LoginManager.getInstance().registerCallback(fbCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                mDialog = new ProgressDialog(MainActivity.this);
                mDialog.setMessage("Restrieving data...");
                mDialog.show();

                GraphRequest request = GraphRequest.newMeRequest(loginResult.getAccessToken(),
                        ((object, response) -> {
                            mDialog.dismiss();
                            Log.d("response", response.toString());
                            try {
                                Toast.makeText(MainActivity.this, ""+object.getString("name"), Toast.LENGTH_SHORT).show();
                            } catch (JSONException e) {
                                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                            }
                            getData(object);

                        }));

                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,nome,email");
                request.setParameters(parameters);
                request.executeAsync();

            }

            @Override
            public void onCancel() {
                Toast.makeText(MainActivity.this, "Cancelado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

        if (AccessToken.getCurrentAccessToken() != null) {
            Toast.makeText(this, ""+AccessToken.getCurrentAccessToken().getUserId(), Toast.LENGTH_SHORT).show();
        }
    }

    public void autentificarComGoogle(View view) {
        //ToDO::loginFacebook
    }

    private void getData(JSONObject object) {
        Toast.makeText(this, "Pegar dados", Toast.LENGTH_SHORT).show();

        try {
            fbData.add("https://graph.facebook.com/"
                    + object.getString("id") +"/picture?width=150&height=150");

            fbData.add(object.getString("name"));
            fbData.add(object.getString("email"));


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

}
