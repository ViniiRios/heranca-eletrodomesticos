public class Geladeira extends Eletrodomestico {
  private double capacidadeLitros;
  private boolean frostFree;

  public Geladeira() {
      super();
}
  
  public Geladeira(String marca, String modelo, int voltagem, double capacidadeLitros, boolean frostFree) {
    super(marca, modelo, voltagem);
    this.capacidadeLitros = capacidadeLitros;
    this.frostFree = frostFree;
}
  
  public double getCapacidadeLitros() {
    return capacidadeLitros;
}

  public void setCapacidadeLitros(double capacidadeLitros) {
    this.capacidadeLitros = capacidadeLitros;
}

  public boolean isFrostFree() {
    return frostFree;
}

  public void setFrostFree(boolean frostFree) {
    this.frostFree = frostFree;
}

  @Override
  public String acaoPrincipal() {
      return "A geladeira conserva alimentos e bebidas.";
}

  @Override
  public String toString() {
      return "Geladeira{" +
              "marca='" + getMarca() + '\'' +
              ", modelo='" + getModelo() + '\'' +
              ", voltagem=" + getVoltagem() +
              ", ligado=" + isLigado() +
              ", capacidadeLitros=" + capacidadeLitros +
              ", frostFree=" + frostFree +
              '}';
}
}
