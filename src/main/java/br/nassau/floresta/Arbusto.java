package main.java.br.nassau.floresta;

public class Arbusto extends Planta {
	// Construtor para Coelho
	public Arbusto(int atualX, int atualY, Terreno terreno) {
		super('*', atualX, atualY, terreno);
	}

	int atualx = atualX;
	int atualy = atualY;

	// Método para o animal se esconder
	public void esconderAnimal(Animal animal) {
		System.out.printf("%c está escondido", animal.getabbreviation());
	}

}