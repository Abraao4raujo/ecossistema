package main.java.br.nassau.floresta;

public class Esquilos extends Animal {
	private boolean sendoCacado;

	// Construtor para Esquilo
	public Esquilos(int startX, int startY) {
		super("Esquilos", "Presa", 'E', 1, startX, startY);
		this.sendoCacado = false;
	}

	public void serCacado() {
		this.sendoCacado = true;
	}

	@Override
	public void fazerBarulho() {
		System.out.println("Esquilos está fazendo um barulho esquisito.");
	}

}
