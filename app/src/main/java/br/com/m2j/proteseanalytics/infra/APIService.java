package br.com.m2j.proteseanalytics.infra;

import android.util.Log;

import java.util.List;

import br.com.m2j.proteseanalytics.api.MedicoService;
import br.com.m2j.proteseanalytics.models.Medico;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIService {

    public static String TAG = APIService.class.getSimpleName();

    public static final String BASE_URL = "http://ben-hero.test:81/api/";

    private Retrofit retrofit;

    private Interceptor interceptor;

    //Endpoint
    private MedicoService medicoService;

    public APIService(){

        this.interceptor = new InterceptorAPI();

        OkHttpClient.Builder builderCliente = new OkHttpClient.Builder();
        builderCliente.interceptors().add(this.interceptor);

        OkHttpClient cliente = builderCliente.build();

        Retrofit.Builder builder = new Retrofit.Builder();

        retrofit = builder.baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(cliente)
                .build();

        medicoService = retrofit.create(MedicoService.class);

    }

    public static String getUrlBase(){return APIService.BASE_URL;}

    public void getDisciplinas(final Retrofitable retrofitable){

        Call<Medico> call = medicoService.medicos();

        call.enqueue(new Callback<Medico>() {
            @Override
            public void onResponse(Call<Medico> call, Response<Medico> response) {
                retrofitable.onRetrofitResponse(response.code(), (List) response.body());
            }

            @Override
            public void onFailure(Call<Medico> call, Throwable t) {
                retrofitable.onRetrofitFailure(t);
            }
        });

    }






}













