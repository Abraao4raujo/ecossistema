package main.java.br.nassau.floresta;

import java.util.Random;

public class Coelho extends Animal {
	// Construtor para Coelho
	public Coelho(double startX, double startY) {
		super("Coelho", "Presa", 'C', 1, startX, startY);
	}

	// Método diferente do Método andar de animal, pois o coelho consegue andar nas
	// laterais, enquanto outros animais andam apenas para cima, baixo, direita e
	// esquerda
	public void andar(Terreno terreno) {

		// Gerar uma direção aleatória de 0 a 7
		int direcao = new Random().nextInt(8);

		double novoX = atualX;
		double novoY = atualY;

		// move o animal para 1 casa em qualquer lado
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

		// Verificar se a nova posiçäo é maior que 0 e menor que o tamanho do terreno
		if (novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
			terreno.tirarAnimal(atualX, atualY);
			terreno.adicionarAnimal(this, novoX, novoY);
			atualX = novoX;
			atualY = novoY;
		}
	}
}
