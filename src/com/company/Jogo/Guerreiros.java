package com.company.Jogo;

public class Guerreiros extends Heroi {

    //Atributos

    private double poderAtaque;

    //Métodos construtores

    public Guerreiros() {

    }
    public Guerreiros(String nome, double vida, double poderAtaque) {
        super(nome, vida);
        this.poderAtaque = poderAtaque;
    }

    //Métodos Getters e Setters


    public double getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(double poderAtaque) {
        this.poderAtaque = poderAtaque;
    }
//Método aplicar Dano

    public double aplicarDano() {
        return poderAtaque;
    }

}