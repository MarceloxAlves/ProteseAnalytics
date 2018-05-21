package br.com.m2j.proteseanalytics.api;

import br.com.m2j.proteseanalytics.models.Medico;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface MedicoService {

    @GET("medico/")
    Call<Medico> medicos();

    @POST("medico/")
    Call<Medico> postMedico(@Body Medico medico);

    @PUT("medico/{id}/")
    Call<Medico> putMedico(@Path("id") long id, @Body Medico medico);

    @DELETE("medico/{id}/")
    Call<ResponseBody> deleteMedico(@Path("id") long id);
}
