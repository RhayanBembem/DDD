package estrutura_decisao;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
			double valor1, valor2, valor3;
						
			System.out.println("Digite o primeiro valor: ");
				valor1 = ler.nextDouble();
				
			System.out.println("Digite o segundo valor: ");
				valor2 = ler.nextDouble();
				
			System.out.println("Digite o terceiro valor: ");
				valor3 = ler.nextDouble();
			
		
		if (valor1 > valor2) {
			if (valor1 > valor3) 
	    System.out.printf("Valor 1 é o maior");
	        else 
				System.out.printf("Valor 3 é o maior");
		}	
	        else {
	        	if(valor2 > valor3)
	        	    System.out.printf("Valor 2 é o maior");
	        else 
	    		    System.out.printf("Valor 3 é o maior");
	       ler.close();
	        }
	        	}
	        }
