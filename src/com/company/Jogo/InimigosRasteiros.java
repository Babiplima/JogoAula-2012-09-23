package com.company.Jogo;

public class InimigosRasteiros extends Inimigos {

    //Atributos

    private double danoEspinhos;

    //Métodos construtores

    public InimigosRasteiros() {

    }

    public InimigosRasteiros(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    public InimigosRasteiros(String nome, double vida, double danoEspinhos) {
        super(nome, vida);
        this.danoEspinhos = danoEspinhos;
    }

    //Métodos Getters e Setters

    public double getDanoEspinhos() {
        return danoEspinhos;
    }

    public void setDanoEspinhos(double danoEspinhos) {
        this.danoEspinhos = danoEspinhos;
    }

    //Método aplicar dano

    public void aplicarDano() {
        return danoEspinhos;
    }
}
