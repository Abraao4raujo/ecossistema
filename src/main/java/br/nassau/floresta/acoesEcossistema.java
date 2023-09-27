package main.java.br.nassau.floresta;

public class acoesEcossistema {
	private Terreno terreno;
	private Coelho coelho;
	private Leao leao;
	private Tigre tigre;
	private Galinha galinha;
	private Veado veado;

	public acoesEcossistema() {
		terreno = new Terreno(10);
		coelho = new Coelho((int) (Math.random() * 10), (int) (Math.random() * 10));
		leao = new Leao((int) (Math.random() * 10), (int) (Math.random() * 10));
		tigre = new Tigre((int) (Math.random() * 10), (int) (Math.random() * 10));
		galinha = new Galinha((int) (Math.random() * 10), (int) (Math.random() * 10));
		veado = new Veado((int) (Math.random() * 10), (int) (Math.random() * 10));
	}

	public void iniciarEcossistema() {
		terreno.exibirTerreno();

		Planta planta = new Planta('|', 3, 3, terreno);
		Planta planta2 = new Planta('|', 4, 6, terreno);
		Planta planta3 = new Planta('|', 5, 3, terreno);

		while (leao.getLife() > 0) {

			System.out.println(coelho.getLife());

			for (int n = 0; n < 10; n++) {
				for (int j = 0; j < 1; j++) {
					Arbusto arbusto = new Arbusto(n, j, terreno);
					if (coelho.getAtualX() == arbusto.getAtualX() && coelho.getAtualY() == arbusto.getAtualY()) {
						System.out.println("coelho se escondeu!");
					}
					if (galinha.getAtualX() == arbusto.getAtualX() && galinha.getAtualY() == arbusto.getAtualY()) {
						System.out.println("galinha se escondeu!");
					}
				}
			}

			for (int n = 0; n < 1; n++) {
				for (int j = 0; j < 10; j++) {
					Arbusto arbusto = new Arbusto(n, j, terreno);
					if (coelho.getAtualX() == arbusto.getAtualX() && coelho.getAtualY() == arbusto.getAtualY()) {
						System.out.println("coelho se escondeu!");
					}
					if (galinha.getAtualX() == arbusto.getAtualX() && galinha.getAtualY() == arbusto.getAtualY()) {
						System.out.println("galinha se escondeu!");
					}
				}
			}

			if (coelho.getAtualX() == planta.getAtualX() && coelho.getAtualY() == planta.getAtualY()
					|| coelho.getAtualX() == planta2.getAtualX() && coelho.getAtualY() == planta2.getAtualY()
					|| coelho.getAtualX() == planta3.getAtualX() && coelho.getAtualY() == planta3.getAtualY()) {
				System.out.println("coelho ganhou mais vida");

				new Planta('|', (int) (Math.random() * 10), (int) (Math.random() * 10), terreno);

				coelho.increaseLife();
			}
			if (galinha.getAtualX() == planta.getAtualX() && galinha.getAtualY() == planta.getAtualY()
					|| galinha.getAtualX() == planta2.getAtualX() && galinha.getAtualY() == planta2.getAtualY()
					|| galinha.getAtualX() == planta3.getAtualX() && galinha.getAtualY() == planta3.getAtualY()) {
				System.out.println("galinha ganhou mais vida");

				new Planta('|', (int) (Math.random() * 10), (int) (Math.random() * 10), terreno);

				galinha.increaseLife();
			}

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
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}