package estrutura_decisao;

import java.util.Scanner;

public class EX18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double valor1, valor2, valor3, total;
		
		System.out.printf(" Qual a velociodade inicial?: ");
		valor1 = ler.nextInt();
		
		System.out.printf("Qual o tempo de percuso (em segundos: ");
		valor2 = ler.nextDouble();
		
		System.out.printf("Valor da aceleração: ");
		valor3 = ler.nextDouble();
		
		total = valor1+(valor3 * valor2);
		  if(total <= 40) {
				System.out.printf(" Velocidade muito lenta! %.2f Km/h", total);
			} else if (total > 40 && total <= 60) {
				System.out.printf(" Velocidade permitida! %.2f Km/h", total);
			} else if(total > 60 && total <= 80) {
				System.out.printf(" Velocidade de cruzeiro! %.2f Km/h", total);
			} else if(total > 80 && total <= 120) {
				System.out.printf(" Velocidade rápida! %.2f Km/h", total);
			} else if(total > 120 ) {
				System.out.printf(" Velocidade muito rápida! %.2f Km/h ", total);
			} else {
				System.out.println("Valor inválido!");
			}
			
			ler.close();
		}

	}