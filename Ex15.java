package estrutura_decisao;

import java.util.Scanner;

public class Ex15 {


		public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ladoa, ladob, ladoc;
		
		System.out.println(" Qual o Triangulo Foi Formado? ");
		
		System.out.println("Digite o primeiro lado: ");
		ladoa = ler.nextDouble();
		
		System.out.println("Digite o segundo lado: ");
		ladob = ler.nextDouble();
		
		System.out.println("Digite o terceiro lado: ");
		ladoc = ler.nextDouble();
		
		if(ladoa + ladob > ladoc && ladoa + ladoc > ladob && ladob + ladoc > ladoa){
			
			if(ladoa != ladob && ladob != ladoc && ladoa != ladoc) {
				System .out.printf("Se formou um tri�ngulo Escaleno!");
			} else if (ladoa == ladob && ladob == ladoc) {
				System.out.printf("Se formou um tri�ngulo Equilatero!");
			} else {
				System.out.printf("Se formou um tri�ngulo Is�celes!");
			}
		} else {
			System.out.printf("N�o se formou um tri�ngulo!");
		}
		ler.close();

	}
}
