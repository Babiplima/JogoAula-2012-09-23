package com.company.Jogo;

public class Inimigos {

    //Atributos

    private String nome;
    private double vida;

    //Métodos contrutores

    public Inimigos() {
    }

    public Inimigos(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    //Getters e setters

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

    // Método trocar nome

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

