package ecossistema_floresta;

//import java.util.Random;

import main.java.br.nassau.floresta.Coelho;
import main.java.br.nassau.floresta.Leao;

import main.java.br.nassau.floresta.Terreno;

public class Ecossistema {
	public static void main(String[] args) {
		
		Terreno terreno = new Terreno(5);
		
		Coelho coelho = new Coelho("Coelho", "Mamiferos", 'C', 1, 1, 1);
		Leao leao = new Leao("Leão", "Carnivoro", 'L', 2, 3, 3);
		
		terreno.exibirTerreno();
		
		while(leao.getLife() > 0 && coelho.getLife() > 0) {
			
			coelho.andar(terreno, 11);
			
			leao.andar(terreno, 4);
			// Exiba o terreno
			terreno.exibirTerreno();
			
			if (coelho.getAtualX() == leao.getAtualX() && coelho.getAtualY() == leao.getAtualY()) {

				leao.increaseLife();
			    
				System.out.println("vida do coelho:" + coelho.getLife());
			    System.out.println("vida do leao:" + leao.getLife());
			    
				coelho.decreaseLife();
			    
			    System.out.println("leao atacou o coelho");
			    
			    leao.rugir();
			}
			try {
				 // Um segundo para exibir o proximo movimento
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}	
//		System.out.println("fim do ecossistema");
	}
}
