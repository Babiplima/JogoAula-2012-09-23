package com.company.Jogo;

public class Magos extends Heroi {

    //Atributos

    private double poderMagico;

    //Métodos construtores

   public Magos(){

   }

    public Magos(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    public Magos(String nome, double vida, double poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    //Métodos Getters e Setters

    public double getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(double poderMagico) {
        this.poderMagico = poderMagico;
    }

    //Método Aplicar Magia

    public double aplicarMagia(){
       return poderMagico;
    }
}

