package main.java.br.nassau.floresta;

public class Esquilos extends Animal {

	// Construtor para Esquilo
	public Esquilos(int startX, int startY) {
		super("Esquilos", "Presa", 'E', 1, startX, startY);
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Esquilos está fazendo um barulho esquisito.");
	}

}
