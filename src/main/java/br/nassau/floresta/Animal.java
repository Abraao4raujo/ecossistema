package main.java.br.nassau.floresta;

import java.util.Random;

public class Animal {
	private char abbreviation;
	private String name, species;
	private int life;
	private double atualX;
    private double atualY;
    
    
    double novoX = atualX;
	double novoY = atualY;
	
	// RECEBE O NOME, ESPECIE E SIGLA DO ANIMAL
	public Animal(String name, String species, char abbreviation, int life, double startX, double startY) {
		this.name = name;
        this.species = species;
        this.abbreviation = abbreviation;
        this.life = life;
        this.atualX = startX;
        this.atualY = startY;
    }
    
    public void andar(Terreno terreno, int nPassos) {
    	// se a quantidade de passos for 4, o animal pode ir apenas para esquerda, direita, cima e baixo.
    	// se a quantidade de passos for 7, o animal pode fazer todos os movimentos, inclusive na diagonal.
    	// se a quantidade for 11, o animal pode dar 2 passos em alguma direção.
    	int direcao = new Random().nextInt(nPassos);

		//novas coordenadas de movimento
		
		
		switch(direcao) {
		case 1: //baixo
			moveDown();
			break;
		case 2: //cima
			moveUp();
			break;
		case 3: //direita
			moveRight();
			break;
		case 4: //esquerda
			moveLeft();
			break;
		case 5: // dois passos para cima
			moveUp();
			moveUp();
			break;
		case 6: // dois passos para baixo
			novoX++;
			novoX++;
			break;
		case 7: //dois passos para a esquerda
			novoY--;
			novoY--;
			break;
		case 8: // dois passos para a direita
			novoY++;
			novoY++;
			break;
		case 9: //diagonal-inferior-direita
			moveDown();
			novoY++;
			break;
		case 10: //diagonal-inferior-esquerda
			moveDown();
			novoY--;
			break;
		case 11: //diagonal-superior-esquerda
			moveUp();
			novoY--;
			break;
		case 12: //diagonal-superior-direita
			moveUp();
			novoY++;
			break;
		}
			
		
		if(novoX >= 0 && novoX < terreno.getTamanho() && novoY >= 0 && novoY < terreno.getTamanho()) {
			terreno.tirarAnimal(atualX, atualY);
			terreno.adicionarAnimal(this, novoX, novoY);
			atualX = novoX;
			atualY = novoY;
    	}
		
	}
    private void moveDown() {
    	//move para a baixo
    	novoX++;
    }
    
    private void moveUp() {
    	//move para a cima
    	novoX--;
    }
    
    private void moveRight() {
    	//move para a direita
    	novoY++;
    }
    
    private void moveLeft() {
    	//move para a direita
    	novoY--;
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
}