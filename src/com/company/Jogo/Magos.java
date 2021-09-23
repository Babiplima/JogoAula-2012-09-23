package com.company.Jogo;

public class Magos extends Heroi {
    private double poderMagico;
    private double aplicarMagia;

    public Magos(double poderMagico, double aplicarMagia){
        super(nome, vida);
        this.poderMagico = poderMagico;
        this.aplicarMagia = aplicarMagia;
    }
}
