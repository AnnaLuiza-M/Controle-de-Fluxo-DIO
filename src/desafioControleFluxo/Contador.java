package desafioControleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro parâmetro");
		num1 = scan.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		num2 = scan.nextInt();
		
		try {
			contar(num1, num2);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
		
	  static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
			if(parametro1>parametro2) {
				throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo.");
			}
				int contagem=parametro2-parametro1;
			
				for(int i=0;i<contagem; i++) {
					System.out.println("Imprimindo o número " + i+1);
					//adicionei a unidade 1 para a contagem começar a partir do número 1
				}
		  
		}

	}


