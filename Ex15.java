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
				System .out.printf("Se formou um triângulo Escaleno!");
			} else if (ladoa == ladob && ladob == ladoc) {
				System.out.printf("Se formou um triângulo Equilatero!");
			} else {
				System.out.printf("Se formou um triângulo Isóceles!");
			}
		} else {
			System.out.printf("Não se formou um triângulo!");
		}
		ler.close();

	}
}
