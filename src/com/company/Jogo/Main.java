package com.company.Jogo;

import Inimigos.Inimigos;

public class Main {

    public static void main(String[] args) {
        Magos mago = new Magos("Mestre dos Magos", 10, 30);
        Guerreiros guerreiro = new Guerreiros("Thor", 300, 500);
        Inimigos inimigos = new Inimigos("Lok", 400);
        Inimigos.InimigosRasteiros("Porco espinho",300,300);

    }
}
