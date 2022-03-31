package estrutura_decisao;

import java.util.Scanner;

public class EX19 {

	public static void main(String[] args) {
	
			Scanner ler=new Scanner(System.in);
			double p1, p2, media;
		
			System.out.printf("Digite a nota da P1: ");
			p1=ler.nextDouble();
			System.out.printf("Digite a nota da P2: ");
			p2=ler.nextDouble();
			
			media=(p1+2*p2)/3;
			
			if(media>=5) {
				System.out.printf("Você foi aprovado!");
			}else {
				System.out.printf("Você foi reprovado!");
			}
		ler.close();
		}

	}

	


