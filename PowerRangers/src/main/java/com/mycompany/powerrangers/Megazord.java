package com.mycompany.powerrangers;

public class Megazord extends Zord {

    public Megazord(String nome) {
        super(nome, "Combinação dos Zords");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando com a Combinação dos Zords!");
    }

    public void combinarZords() {
        System.out.println(getNome() + " está combinando os Zords!");
    }
}
