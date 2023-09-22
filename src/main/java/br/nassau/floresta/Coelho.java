package main.java.br.nassau.floresta;

import java.util.Random;

public class Coelho extends Animal {
	// Construtor para Coelho
	public Coelho(double startX, double startY) {
		super("Coelho", "Presa", 'C', 1, startX, startY);
	}

	public void andar(Terreno terreno) {

		int direcao = new Random().nextInt(8); // Gerar uma direção aleatória de 0 a 7

		double novoX = atualX;
		double novoY = atualY;

		switch (direcao) {
		case 0: // baixo
			novoX++;
			break;
		case 1: // cima
			novoX--;
			break;
		case 2: // direita
			novoY++;
			break;
		case 3: // esquerda
			novoY--;
			break;
		case 4: // diagonal-inferior-direita
			novoX++;
			novoY++;
			break;
		case 5: // diagonal-inferior-esquerda
			novoX++;
			novoY--;
			break;
		case 6: // diagonal-superior-esquerda
			novoX--;
			novoY--;
			break;
		case 7: // diagonal-superior-direita
			novoX--;
			novoY++;
			break;
		}
		if (novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
			terreno.tirarAnimal(atualX, atualY);
			terreno.adicionarAnimal(this, novoX, novoY);
			atualX = novoX;
			atualY = novoY;
		}
	}
}
