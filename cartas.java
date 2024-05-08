import packages.IO;

// Classe que representa uma carta do baralho
class Carta {
    // Atributos
    private int numeroCarta;
    private String corCarta;
    private String simboloCarta;
    // Construtor
    public Carta(int numeroCarta, String corCarta, String simboloCarta) {
        this.numeroCarta = numeroCarta;
        this.corCarta = corCarta;
        this.simboloCarta = simboloCarta;
    }
    @Override
    public String toString() {
        return ("Numero: "+this.getNumeroCarta()+
                    " Cor: "+ this.getCorCarta() +
                    " Simbolo: "+ this.getSimboloCarta());
    }
    // getter
    public int getNumeroCarta() { return numeroCarta; }
    public String getCorCarta() { return corCarta; }
    public String getSimboloCarta() { return simboloCarta; }
    // setter
    public void setId(int numeroCarta) { this.numeroCarta = numeroCarta; }
    public void setTanque(String corCarta) { this.corCarta = corCarta; }
    public void setFaturamento(String simboloCarta) {this.simboloCarta = simboloCarta; }
}