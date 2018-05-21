package br.com.m2j.proteseanalytics.infra;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


public class InterceptorAPI implements Interceptor{


    public static final String AUTHORIZATION = "Authorization";
    public static final String TOKEN = "b65ecc64073fca22100123d591145ea7ee2994cf";

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request().newBuilder()
                .addHeader(AUTHORIZATION, TOKEN)
                .build();

        return chain.proceed(request);
    }
}

