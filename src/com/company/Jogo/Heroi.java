package com.company.Jogo;

public class Heroi {
    private String nome;
    private double vida;

    public Heroi() {

    }

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Método trocar

    public void trocar(String trocarNome) {
        trocarNome = nome;
    }
    //Receber dano

    public void receber(double receberDano) {
        receberDano = vida;

        //Exibir vida
    }

    public void exibir(double exibirVida) {
        exibirVida = vida;
    }

}

