package Inimigos;

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

