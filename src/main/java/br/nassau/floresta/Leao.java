package main.java.br.nassau.floresta;

public class Leao extends Animal {
	// Construtor para Leao
	public Leao(double startX, double startY) {
		super("Leao", "Predador", 'L', 5, startX, startY);
	};

	// Método rugir para o leäo
	// OBS: NÁO ESTOU UTILIZANDO ESSE MÉTODO!!
	public void rugir() {
		System.out.println("O leao esta rugindo!");
	};
};