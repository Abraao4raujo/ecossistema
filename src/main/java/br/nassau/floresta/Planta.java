package main.java.br.nassau.floresta;

public class Planta {
	char abbreviation;
	String type;
	int atualX;
	int atualY;
	
	public Planta(char abbreviation, int atualX, int atualY, Terreno terreno) {
		this.abbreviation = abbreviation;
		this.atualX = atualX;
		this.atualY = atualY;
		terreno.adicionarPlanta(abbreviation ,this.atualX, this.atualY);
	}
	
	public char getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(char abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAtualX() {
		return atualX;
	}
	public void setAtualX(int atualX) {
		this.atualX = atualX;
	}
	public int getAtualY() {
		return atualY;
	}
	public void setAtualY(int atualY) {
		this.atualY = atualY;
	}
}