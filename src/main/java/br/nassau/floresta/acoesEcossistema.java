package main.java.br.nassau.floresta;

public class acoesEcossistema {
	private Terreno terreno;
	private Coelho coelho;
	private Leao leao;
	private Tigre tigre;
	private Galinha galinha;
	private Veado veado;

	public acoesEcossistema() {
		terreno = new Terreno(7);
		coelho = new Coelho(2, 3);
		leao = new Leao(3, 4);
		tigre = new Tigre(4, 5);
		galinha = new Galinha(5, 6);
		veado = new Veado(2, 6);
	}

	public void iniciarEcossistema() {
		terreno.exibirTerreno();

		while (veado.getLife() > 0 || coelho.getLife() > 0 || galinha.getLife() > 0) {

			System.out.println(coelho.getLife());

			if (coelho.getLife() > 0) {
				leao.encontrarAnimal(coelho, terreno);
				tigre.encontrarAnimal(coelho, terreno);
				coelho.andar(terreno);
			}
			
			if (veado.getLife() > 0) {
				leao.encontrarAnimal(veado, terreno);
				tigre.encontrarAnimal(veado, terreno);
				veado.andar(terreno);
			}
			
			if (galinha.getLife() > 0) {
				tigre.encontrarAnimal(galinha, terreno);
				leao.encontrarAnimal(galinha, terreno);
				galinha.andar(terreno);
			}

			leao.andar(terreno);
			tigre.andar(terreno);

			// Exiba o terreno
			terreno.exibirTerreno();

			try {
				// Um segundo para exibir o proximo movimento
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}