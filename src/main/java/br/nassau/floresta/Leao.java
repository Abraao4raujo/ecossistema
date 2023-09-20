package main.java.br.nassau.floresta;

public class Leao extends Animal {
    // Construtor para Leao
    public Leao(String name, String species, char abbreviation, int life, double startX, double startY) {
        super(name, species ,abbreviation, life, startX, startY);
    }

    public void rugir() {
        System.out.println("O leao esta rugindo!");
    }
    
}