package estrutura_decisao;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

			Scanner ler = new Scanner(System.in);
			double p1,p2,media;
			
			System.out.printf("Digite a nota da P1: ");
			p1 = ler.nextDouble();
			
			media=5;
			p2=(3*media-p1)/2;
			
			System.out.printf("Você precisa tirar %.0f",p2);
			
			ler.close();
			
	}

}
