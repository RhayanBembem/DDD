package estrutura_decisao;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
			double base, altura, area;
			
			System.out.println("==== Área do Traingulo ===");
			
			System.out.println("Digite a base: ");
				base = ler.nextDouble();
			System.out.println("Digite a altura: ");
				altura = ler.nextDouble();
			
			area = base * altura;
		
		if (area >= 100) {
	    System.out.printf(" %.1f. Terreno Grande!", area);
	        }else {
	        }
		ler.close();
	}
	}
