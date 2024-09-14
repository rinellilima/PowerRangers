package com.mycompany.powerrangers;

public class RangerAmarelo extends Ranger {

    public RangerAmarelo(String nome) {
        super(nome, "Amarelo", "Lança da Luz");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando com a Lança da Luz!");
    }

    @Override
    public void transformar() {
        System.out.println(getNome() + " está se transformando em Ranger Amarelo!");
    }

    public void usarPoderAcelerado() {
        System.out.println(getNome() + " está usando o Poder Acelerado!");
    }
}
