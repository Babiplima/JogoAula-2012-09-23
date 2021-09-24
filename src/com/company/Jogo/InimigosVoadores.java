package com.company.Jogo;

public class InimigosVoadores extends Inimigos {

    private double danoTiro;

    public InimigosVoadores(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public InimigosVoadores(String nome, double vida, double danoTiro) {
        super(nome, vida);
        this.danoTiro = danoTiro;
    }

    public double getDanoTiro() {

        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }


}
