package estrutura_decisao;

import java.util.Scanner;

public class EX16 {

			public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			double cat1, cat2, hip;
			
			System.out.println("É Triangulo Retângulo? ");
			
			System.out.println("Digite o primeiro cateto: ");
			cat1 = ler.nextDouble();
			
			System.out.println("Digite o segundo cateto: ");
			cat2 = ler.nextDouble();
			
			System.out.println("Digite a hipotenusa: ");
			hip = ler.nextDouble();
			
			if(cat1 * cat1 + cat2 * cat2 == hip * hip) {
				System.out.println("Se forma um triângulo retângulo!");
			} else {
				System.out.println("Não se forma um triângulo retângulo!");
			}
			
			ler.close();
		
		}
	}

