package Inimigos;

public class InimigosRasteiros extends Inimigos {
    private double danoEspinhos;
    private double aplicarDano;

    public InimigosRasteiros(double danoEspinhos, double aplicarDano) {
        this.danoEspinhos = danoEspinhos;
        this.aplicarDano = aplicarDano;
    }

    public InimigosRasteiros(String nome, double vida, double danoEspinhos, double aplicarDano) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
        this.aplicarDano = aplicarDano;
    }

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public double getAplicarDano() {
        return aplicarDano;
    }

    public void setAplicarDano(double aplicarDano) {
        this.aplicarDano = aplicarDano;
    }
}
