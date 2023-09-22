package main.java.br.nassau.floresta;

public class Terreno {
	private char[][] mapa;
	private int tamanho;

	// CRIA O TAMANHO DO TERRENO

	public Terreno(int tamanho) {
		this.tamanho = tamanho;
		mapa = new char[tamanho][tamanho];
		inicializarMapa();
	}

	public int getTamanho() {
		return this.tamanho;
	}

	// INICIA O MAPA

	private void inicializarMapa() {
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {
				mapa[i][j] = ' ';
			}
		}
	}

	// ADICIONAR O ANIMAL NO MAPA

	public void adicionarAnimal(Animal animal, double x, double y) {
		if (x >= 0 && x < mapa.length && y < mapa[0].length) {
			mapa[(int) x][(int) y] = animal.getabbreviation();
		}
	}

	// TIRAR ANIMAL ANIMAL DO TERRENO
	public void tirarAnimal(double xAtual, double yAtual) {
		mapa[(int) xAtual][(int) yAtual] = ' ';
	}

	// EXIBIR O TERRENO NO CONSOLE

	public void exibirTerreno() {
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[0].length; j++) {
				System.out.print(mapa[i][j] + "_");
			}
			System.out.println();
		}
		System.out.println();
	}

}
