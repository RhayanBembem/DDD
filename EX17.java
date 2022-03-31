package estrutura_decisao;

import java.util.Scanner;

public class EX17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double peso, altura, imc, sexo;
			
		System.out.printf(" Digite 1, se o sexo for Masculino; \n  Digite 2, se o sexo for Feminino:\n ");
		sexo = ler.nextInt();
		
		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o peso: ");
		peso = ler.nextDouble();
	
		imc = peso / (altura * altura);
		
			if (sexo == 1) {
			
				if (imc < 20) {
					System.out.printf("Está abaixo do peso ideal, para o sexo masculino = %.2f ", imc);
					
					}else if(((imc) >= 20 && imc < 25)){
						System.out.printf("Está entre o peso ideal, para o sexo masculino = %.2f ", imc);
			    
					}else{
						System.out.printf("Está acima do peso ideal, para o sexo masculino = %.2f ", imc);
					 }
		 }else {
					
			 	if (imc < 19) {
					System.out.printf("Está abaixo do peso ideal, para o sexo feminino = %.2f ", imc);
					
				}else if ((imc >= 19) && imc < 24){
					System.out.printf("Está entre o peso ideal, para o sexo feminino = %.2f ", imc);
				}else {
					System.out.printf("Está acima do peso ideal, para o sexo feminino = %.2f ", imc);
					
				ler.close();
				 }
				
			  }
				
		}
		
	}