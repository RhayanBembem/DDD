package estrutura_decisao;

import java.util.Scanner;

public class EX16 {

			public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			double cat1, cat2, hip;
			
			System.out.println("� Triangulo Ret�ngulo? ");
			
			System.out.println("Digite o primeiro cateto: ");
			cat1 = ler.nextDouble();
			
			System.out.println("Digite o segundo cateto: ");
			cat2 = ler.nextDouble();
			
			System.out.println("Digite a hipotenusa: ");
			hip = ler.nextDouble();
			
			if(cat1 * cat1 + cat2 * cat2 == hip * hip) {
				System.out.println("Se forma um tri�ngulo ret�ngulo!");
			} else {
				System.out.println("N�o se forma um tri�ngulo ret�ngulo!");
			}
			
			ler.close();
		
		}
	}

