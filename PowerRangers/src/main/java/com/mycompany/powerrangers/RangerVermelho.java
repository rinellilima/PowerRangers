
package com.mycompany.powerrangers;

public class RangerVermelho extends Ranger {

    public RangerVermelho(String nome) {
        super(nome, "Vermelho", "Espada do Fogo");
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " está atacando com a Espada do Fogo!");
    }

    @Override
    public void transformar() {
        System.out.println(getNome() + " está se transformando em Ranger Vermelho!");
    }

    public void liderarEquipe() {
        System.out.println(getNome() + " está liderando a equipe!");
    }
}
