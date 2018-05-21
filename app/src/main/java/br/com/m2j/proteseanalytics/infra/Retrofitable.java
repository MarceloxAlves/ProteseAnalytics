package br.com.m2j.proteseanalytics.infra;

import java.util.List;

public interface Retrofitable {

    public void onRetrofitResponse(int status, List dados);

    public void onRetrofitFailure(Throwable t);
}
