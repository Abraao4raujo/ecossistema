package ecossistema_floresta;

import main.java.br.nassau.floresta.acoesEcossistema;

public class Ecossistema {
	public static void main(String[] args) {

		acoesEcossistema acoesEcossistema = new acoesEcossistema();
		acoesEcossistema.iniciarEcossistema();

//		Terreno terreno = new Terreno(7);
//		Coelho coelho = new Coelho(2, 3);
//		Leao leao = new Leao(3, 4);
//		Tigre tigre = new Tigre(4, 5);
//		Galinha galinha = new Galinha(5,6);
//		Veado veado = new Veado(2,6);
//		
//		terreno.exibirTerreno();

//		while(leao.getLife() >= 0 && coelho.getLife() >= 0) {
//			
//			coelho.andar(terreno);
//			leao.andar(terreno);
//			tigre.andar(terreno);
//			galinha.andar(terreno);
//			veado.andar(terreno);
//			
//			// Exiba o terreno
//			terreno.exibirTerreno();
//
//		    leao.encontrarAnimal(coelho, terreno);
//		    leao.encontrarAnimal(veado, terreno);
//		    leao.encontrarAnimal(galinha, terreno);
//		    tigre.encontrarAnimal(coelho, terreno);
//		    tigre.encontrarAnimal(veado, terreno);
//		    tigre.encontrarAnimal(galinha, terreno);
//
//		    
//			try {
//				 // Um segundo para exibir o proximo movimento
//	            Thread.sleep(1000);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//		}	
//		System.out.println("fim do ecossistema");
	}
}
