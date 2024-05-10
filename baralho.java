import java.util.ArrayList;
import packages.IO;
import java.util.Random;


// Classe que representa um baralho de cartas
class Baralho {
    // Atributo
    private ArrayList<Carta> baralho;
    // Construtor
    public Baralho() {
        baralho = new ArrayList<Carta>();
    }
    // Print baralho
    public void printCartas(){
        for(Carta item : baralho) {
            System.out.println(item);
        }
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
    // Método: Embaralhar
    public void embaralhar() {
            int iterador = 0;
            Random random = new Random();         
            for(Carta item : baralho) {
                int numRandom = random.nextInt(baralho.size());
                Carta itemGuardado = item;
                Carta itemRandom = baralho.get(numRandom);
                baralho.set(iterador, itemRandom);
                baralho.set(numRandom, itemGuardado);
                iterador += 1;
            }
        }
    // Método: Get element do baralho
    public Carta getElemnt(int id) {
        Carta carta = baralho.get(id);
        return carta;
    }
    // Método: Remove elemnt do baralho
    public void removeElemt(int id) {
        baralho.remove(id);
    }
     // Método: Resultar tamanho do baralho
     public int tamanho() {
        int tamanho = baralho.size();
        return tamanho;
    }
}