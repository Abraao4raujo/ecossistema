package ecossistema_floresta;

//import java.util.Random;

import main.java.br.nassau.floresta.Coelho;
import main.java.br.nassau.floresta.Galinha;
import main.java.br.nassau.floresta.Leao;
import main.java.br.nassau.floresta.Tigre;
import main.java.br.nassau.floresta.Veado;
import main.java.br.nassau.floresta.Terreno;

public class Ecossistema {
	public static void main(String[] args) {
		
		Terreno terreno = new Terreno(7);
		
		Coelho coelho = new Coelho(2, 3);
		Leao leao = new Leao(3, 4);
		Tigre tigre = new Tigre(4, 5);
		Galinha galinha = new Galinha(5,6);
		Veado veado = new Veado(2,6);
		
		terreno.exibirTerreno();
		
		while(leao.getLife() >= 0 && coelho.getLife() >= 0) {
			
			coelho.andar(terreno);
			leao.andar(terreno);
			tigre.andar(terreno);
			galinha.andar(terreno);
			veado.andar(terreno);
			
			// Exiba o terreno
			terreno.exibirTerreno();

		    leao.encontrar(coelho);
		    leao.encontrar(veado);
		    leao.encontrar(galinha);
		    tigre.encontrar(coelho);
		    tigre.encontrar(veado);
		    tigre.encontrar(galinha);
			    
		    coelho.morrer();
		    veado.morrer();
		    galinha.morrer();
			try {
				 // Um segundo para exibir o proximo movimento
	            Thread.sleep(100);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		}	
//		System.out.println("fim do ecossistema");
	}
}
