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

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Método comum
    public void ligar() {
        this.ligado = true;
        System.out.println("O eletrodoméstico foi ligado.");
    }

    // Método comum
    public void desligar() {
        this.ligado = false;
        System.out.println("O eletrodoméstico foi desligado.");
    }

    // Método que vai ser sobrescrito nas filhas
    public String acaoPrincipal() {
        return "Função principal do eletrodoméstico.";
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", voltagem=" + voltagem +
                ", ligado=" + ligado +
                '}';
    }
    
}
