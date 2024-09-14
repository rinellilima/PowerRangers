package com.mycompany.powerrangers;

public class Ranger {
    private String nome;
    private String cor;
    private String armaPrincipal;

    public Ranger(String nome, String cor, String armaPrincipal) {
        this.nome = nome;
        this.cor = cor;
        this.armaPrincipal = armaPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public void atacar() {
        System.out.println(nome + " está atacando com a arma " + armaPrincipal + "!");
    }

    public void defender() {
        System.out.println(nome + " está se defendendo!");
    }

    public void transformar() {
        System.out.println(nome + " está se transformando!");
    }
}
