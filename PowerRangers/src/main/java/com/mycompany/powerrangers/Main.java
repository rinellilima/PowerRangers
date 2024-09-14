package com.mycompany.powerrangers;

public class Main {
    public static void main(String[] argsme) {
        RangerVermelho rangerVermelho = new RangerVermelho("Adalberto");
        RangerAmarelo rangerAmarelo = new RangerAmarelo("Jucara");
        RangerAzul rangerAzul = new RangerAzul("Jamerson");

        rangerVermelho.atacar();
        rangerVermelho.defender();
        rangerVermelho.transformar();
        rangerVermelho.liderarEquipe();

        rangerAmarelo.atacar();
        rangerAmarelo.defender();
        rangerAmarelo.transformar();
        rangerAmarelo.usarPoderAcelerado();

        rangerAzul.atacar();
        rangerAzul.defender();
        rangerAzul.transformar();
        rangerAzul.usarPoderAquático();

        Megazord megazord = new Megazord("MegaZord");
        megazord.atacar();
        megazord.combinarZords();
    }
}
