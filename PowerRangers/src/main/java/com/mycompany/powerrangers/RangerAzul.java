package com.mycompany.powerrangers;

public class RangerAzul extends Ranger {

    public RangerAzul(String nome) {
        super(nome, "Azul", "Tridente das Águas");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando com o Tridente das Águas!");
    }

    @Override
    public void transformar() {
        System.out.println(getNome() + " está se transformando em Ranger Azul!");
    }

    public void usarPoderAquático() {
        System.out.println(getNome() + " está usando o Poder Aquático!");
    }
}
