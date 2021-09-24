package com.company.Jogo;

//Atributos

public class Heroi {
    private String nome;
    private double vida;

    //Métodos contrutores

    public Heroi() {
    }

    public Heroi(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    //Get e Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    // Método trocar

    public void trocar(String trocarNome) {
        trocarNome = nome;
    }
    //Receber dano

    public void receber(double receberDano) {
        this.vida = this.vida - receberDano;

        //Exibir vida
    }

    public void exibir(double exibirVida) {
        exibirVida = vida;
    }
}

