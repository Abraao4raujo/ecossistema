package main.java.br.nassau.floresta;

public class Arbusto extends Planta {
	public Arbusto(int atualX, int atualY, Terreno terreno) {
		super('*', atualX, atualY, terreno);
	}
	int atualx = atualX;
	int atualy = atualY;

	public void esconderAnimal(Animal animal) {
		System.out.printf("%c está escondido", animal.getabbreviation());
	}

}