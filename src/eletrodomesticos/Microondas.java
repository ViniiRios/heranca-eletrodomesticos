// Classe filha
public class Microondas extends Eletrodomestico {
    private int potenciaWatts;
    private boolean possuiGrill;

    // Construtor vazio
    public Microondas() {
        super();
    }

    // Construtor com dados
    public Microondas(String marca, String modelo, int voltagem, int potenciaWatts, boolean possuiGrill) {
        super(marca, modelo, voltagem);
        this.potenciaWatts = potenciaWatts;
        this.possuiGrill = possuiGrill;
    }

    // Getters e setters
    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public boolean isPossuiGrill() {
        return possuiGrill;
    }

    public void setPossuiGrill(boolean possuiGrill) {
        this.possuiGrill = possuiGrill;
    }

    // Método sobrescrito
    @Override
    public String acaoPrincipal() {
        return "O micro-ondas aquece e descongela alimentos.";
    }

    @Override
    public String toString() {
        return "Microondas{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", voltagem=" + getVoltagem() +
                ", ligado=" + isLigado() +
                ", potenciaWatts=" + potenciaWatts +
                ", possuiGrill=" + possuiGrill +
                '}';
    }
}
