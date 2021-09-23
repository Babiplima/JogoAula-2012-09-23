package Inimigos;

public class InimigosVoadores extends Inimigos {
    private double danoTiro;
    private double aplicarDano;

    public InimigosVoadores(double danoTiro, double aplicarDano) {
        this.danoTiro = danoTiro;
        this.aplicarDano = aplicarDano;
    }

    public InimigosVoadores(String nome, double vida, double danoTiro, double aplicarDano) {
        super(nome, vida);
        this.danoTiro = danoTiro;
        this.aplicarDano = aplicarDano;
    }

    public double getDanoTiro() {
        return danoTiro;
    }

    public void setDanoTiro(double danoTiro) {
        this.danoTiro = danoTiro;
    }

    public double getAplicarDano() {
        return aplicarDano;
    }

    public void setAplicarDano(double aplicarDano) {
        this.aplicarDano = aplicarDano;
    }
}
