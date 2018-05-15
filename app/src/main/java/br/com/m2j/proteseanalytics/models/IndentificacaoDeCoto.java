package br.com.m2j.proteseanalytics.models;

public enum IndentificacaoDeCoto {

    BracoEsquerdo("Braço Esquerdo"),
    BracoDireito("Braço Direito"),
    AmbosBracos("Ambos os Braços");

    private final String braço;

    IndentificacaoDeCoto(String braço) {
        this.braço = braço;
    }

    public String getBraço() {
        return braço;
    }
}
