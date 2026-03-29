package eletrodomesticos;

public class Eletrodomestico {
    private String marca;
    private String modelo;
    private int voltagem;
    private boolean ligado;

    // Construtor vazio
    public Eletrodomestico() {
    }

    // Construtor com dados
    public Eletrodomestico(String marca, String modelo, int voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
        this.ligado = false; // começa desligado
    }

    
}
