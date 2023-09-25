package main.java.br.nassau.floresta;

import java.util.Random;

public class Animal {
	private char abbreviation;
	private String name, species;
	private int life;
	protected double atualX;
	protected double atualY;

	// RECEBE O NOME, ESPECIE E SIGLA DO ANIMAL
	public Animal(String name, String species, char abbreviation, int life, double startX, double startY) {
		this.name = name;
		this.species = species;
		this.abbreviation = abbreviation;
		this.life = life;
		this.atualX = startX;
		this.atualY = startY;
	}

	// RETORNA O NOME, ESPECIE, VIDA E SIGLA DO ANIMAL

	public String getName() {
		return name;
	};

	public String getSpecies() {
		return species;
	}

	public char getabbreviation() {
		return abbreviation;
	}

	public int getLife() {
		return life;
	}

	public double getAtualX() {
		return atualX;
	}

	public double setAtualX(double atualX) {
		return this.atualX = atualX;
	}

	public double setAtualY(double atualY) {
		return this.atualY = atualY;
	}

	public double getAtualY() {
		return atualY;
	}

	public void setLife(int life) {
		this.life = life;
	}

	// diminui a vida do animal -1
	public void decreaseLife() {
		this.life--;
	}

	public void increaseLife() {
		this.life++;
	}

	public void andar(Terreno terreno) {
		// novas coordenadas de movimento
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

		if (novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
			terreno.tirarAnimal(atualX, atualY);
			terreno.adicionarAnimal(this, novoX, novoY);
			atualX = novoX;
			atualY = novoY;
		}
	}

	public void encontrarAnimal(Animal outroAnimal, Terreno terreno) {
		if (this.getAtualX() == outroAnimal.getAtualX() && this.getAtualY() == outroAnimal.getAtualY()) {
			if (this.getSpecies().equals("Predador") && outroAnimal.getSpecies().equals("Presa")) {
				outroAnimal.decreaseLife();
				System.out.printf("%s atacou o %s%n", this.getName(), outroAnimal.getName());
			}
		}
	}
}