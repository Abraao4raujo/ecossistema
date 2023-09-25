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
		
		while (leao.getLife() > 0) {

			System.out.println(coelho.getLife());

//			terreno.adicionarPlanta(1, 2);
//			terreno.adicionarPlanta(4, 5);
//			terreno.adicionarPlanta(6, 6);
//			
			Planta planta = new Planta('|', 1, 2, terreno);
			Planta planta2 = new Planta('|', 3, 5, terreno);
			Planta planta3 = new Planta('|', 5, 6, terreno);
			
			if(coelho.getAtualX() == planta.getAtualX() && coelho.getAtualY() == planta.getAtualY() ||
				coelho.getAtualX() == planta2.getAtualX() && coelho.getAtualY() == planta2.getAtualY() ||
				coelho.getAtualX() == planta3.getAtualX() && coelho.getAtualY() == planta3.getAtualY()) {
				System.out.println("coelho ganhou mais vida");
				coelho.increaseLife();
			}
//			planta.colocarPlanta(terreno);
//			planta2.colocarPlanta(terreno);
//			planta3.colocarPlanta(terreno);
			
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