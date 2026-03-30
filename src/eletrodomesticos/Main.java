package eletrodomesticos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando os objetos
        Geladeira geladeira = new Geladeira("Brastemp", "Inverse", 220, 400.0, true);
        Microondas microondas = new Microondas("LG", "EasyClean", 127, 800, true);

        // Lista usando o tipo da classe mãe
        List<Eletrodomestico> lista = new ArrayList<>();
        lista.add(geladeira);
        lista.add(microondas);

        // Percorrendo a lista
        for (Eletrodomestico eletrodomestico : lista) {
            System.out.println("================================");
            System.out.println("Tipo: " + eletrodomestico.getClass().getSimpleName());
            System.out.println(eletrodomestico);
            System.out.println("Ação principal: " + eletrodomestico.acaoPrincipal());

            // Método comum herdado da classe mãe
            eletrodomestico.ligar();
            System.out.println("Está ligado? " + eletrodomestico.isLigado());

            eletrodomestico.desligar();
            System.out.println("Está ligado? " + eletrodomestico.isLigado());
        }
    }
}