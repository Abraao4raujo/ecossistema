package main.java.br.nassau.floresta;

import java.util.Random;

public class Animal {
	// variaveis da classe Animal
	private char abbreviation;
	private String name, species;
	private int life;
	protected double atualX;
	protected double atualY;

	// Construtor da classe Animal
	public Animal(String name, String species, char abbreviation, int life, double startX, double startY) {
		// Inicializa os campos com os valores passados como argumentos
		this.name = name;
		this.species = species;
		this.abbreviation = abbreviation;
		this.life = life;
		this.atualX = startX;
		this.atualY = startY;
	}

	// MÉTODOS DO ANIMAL

	// retorna o nome do animal
	public String getName() {
		return name;
	};

	// retorna a especie do animal
	public String getSpecies() {
		return species;
	}

	// retorna a sigla do animal
	public char getabbreviation() {
		return abbreviation;
	}

	// retorna a quantidade de vida do animal
	public int getLife() {
		return life;
	}

	// retorna a coordenada X do animal
	public double getAtualX() {
		return atualX;
	}

	// retorna a coordenada Y do animal
	public double getAtualY() {
		return atualY;
	}

	// Define a coordenada X do animal
	public double setAtualX(double atualX) {
		return this.atualX = atualX;
	}

	// Define a coordenada Y do animal
	public double setAtualY(double atualY) {
		return this.atualY = atualY;
	}

	// Define a vida do animal
	public void setLife(int life) {
		this.life = life;
	}

	// Diminui a vida do animal em 1
	public void decreaseLife() {
		this.life--;
	}

	// Aumenta a vida do animal em 1
	public void increaseLife() {
		this.life++;
	}

	// Mover o animal no terreno
	public void andar(Terreno terreno) {

		// Gera uma direção de movimento aleatória (0 a 3)
		int direcao = new Random().nextInt(4);
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
		}

		// Verifica se as novas coordenadas estão dentro do terreno
		if (novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
			terreno.tirarAnimal(atualX, atualY);
			terreno.adicionarAnimal(this, novoX, novoY);
			atualX = novoX;
			atualY = novoY;
		}
	}

	// Método para o animal encontrar outro animal no terreno
	public void encontrarAnimal(Animal outroAnimal, Terreno terreno) {
		if (this.getAtualX() == outroAnimal.getAtualX() && this.getAtualY() == outroAnimal.getAtualY()) {
			if (this.getSpecies().equals("Predador") && outroAnimal.getSpecies().equals("Presa")) {
				outroAnimal.decreaseLife();
				System.out.printf("%s atacou o %s%n", this.getName(), outroAnimal.getName());
			}
		}
	}
}