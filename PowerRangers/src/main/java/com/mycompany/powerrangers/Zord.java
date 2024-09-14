package com.mycompany.powerrangers;

public class Zord {
    private String nome;
    private String poder;

    public Zord(String nome, String poder) {
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void atacar() {
        System.out.println(nome + " está atacando com o poder " + poder + "!");
    }
}
