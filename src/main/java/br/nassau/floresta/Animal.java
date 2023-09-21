package main.java.br.nassau.floresta;

import java.util.Random;

public class Animal {
	private char abbreviation;
	private String name, species;
	private int life;
	protected double atualX;
	protected double atualY;
    
 // Variáveis de coordenadas iniciais
    protected double novoX;
    protected double novoY;
	
	// RECEBE O NOME, ESPECIE E SIGLA DO ANIMAL
	public Animal(String name, String species, char abbreviation, int life, double startX, double startY) {
		this.name = name;
        this.species = species;
        this.abbreviation = abbreviation;
        this.life = life;
        this.atualX = startX;
        this.atualY = startY;
        
        // Inicializa as coordenadas iniciais do animal
        this.novoX = startX;
        this.novoY = startY;
    }
	
	public void encontrar(Animal outroAnimal) {
		if(this.getAtualX() == outroAnimal.getAtualX() && this.getAtualY() == outroAnimal.getAtualY()){
			if(this.getSpecies() == "Predador" && outroAnimal.getSpecies()  == "Presa") {
				outroAnimal.decreaseLife();
				System.out.printf("%s atacou o %s", this.getName(), outroAnimal.getName());
			}
		}
	}
	
	public void morrer() {
		if(this.getLife() == 0) {
			System.out.printf("%s morreu", this.getName());
			ceuDosAnimais();
		}
	}
	
	public void ceuDosAnimais() {
		this.atualX = 0;
		this.atualY = 0;
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
	
	public double getAtualY() {
		return atualY;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	//diminui a vida do animal -1
    public void decreaseLife() {
    	this.life--;
    }
    
    public void increaseLife() {
    	this.life++;
    }
    
    public void andar(Terreno terreno) {
    	int direcao = new Random().nextInt(4);
		//novas coordenadas de movimento
		novoX = atualX;
		novoY = atualY;
		
		switch(direcao) {
		case 0: //baixo
			novoX++;
			break;
		case 1: //cima
			novoX--;
			break;
		case 2: //direita
			novoY++;
			break;
		case 3: //esquerda
			novoY--;
			break;
		}
			
		
		if(novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
			terreno.tirarAnimal(atualX, atualY);
			terreno.adicionarAnimal(this, novoX, novoY);
			atualX = novoX;
			atualY = novoY;
    	}
    }
}