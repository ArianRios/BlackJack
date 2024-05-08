import java.util.ArrayList;
import packages.IO;

// Classe que representa um baralho de cartas
class Baralho {
    // Atributo
    private ArrayList<Carta> baralho;
    // Construtor
    public Baralho() {
        baralho = new ArrayList<Carta>();
    }
    // getter: Print baralho
    public Carta getCartas(){
        for(Carta item : baralho) {
            System.out.println(item);
        }
        return null;
    }
    // Método: Criar Baralho para BlackJack
    public void baralhoCreate() {
        int iterador = 0; 
        for(int i = 0; i < 4; i++) { 
            if(iterador == 0) {
                for(int j = 1; j < 14; j++) {
                    Carta carta = new Carta(j, "Preto", "Espadas");
                    baralho.add(carta);
                } 
                iterador = 1;
            } else if (iterador == 1) {
                for(int j = 1; j < 14; j++) {
                    Carta carta = new Carta(j, "Vermelho", "Ouros");
                    baralho.add(carta);
                } 
                iterador = 2;
            } else if (iterador == 2) {
                for(int j = 1; j < 14; j++) {
                    Carta carta = new Carta(j, "Preto", "Paus");
                    baralho.add(carta);
                } 
                iterador = 3;
            } else if (iterador == 3) {
                for(int j = 1; j < 14; j++) {
                    Carta carta = new Carta(j, "Vermelho", "Copas");
                    baralho.add(carta);
                } 
            }
        }
    } 

}