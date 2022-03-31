package estrutura_decisao;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
			double peso, altura, ideal;
						
			System.out.println("Digite o peso: ");
				peso = ler.nextDouble();
				
			System.out.println("Digite a altura: ");
				altura = ler.nextDouble();
				
			ideal = peso/(altura*altura);
			if (ideal >= 18.5 && ideal <= 24.9) {
			    System.out.printf(" %.2f O seu peso é o ideal!", ideal);
			        }else {
			        	    System.out.printf(" %.2f O seu peso não é o ideal!", ideal);
			        }
				ler.close();
	}
}

	        
