package PortoSeguro;
import java.util.Scanner; // Importanto a biblioteca do Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		float P = 0, E = 0, M = 0; /* Declarando as variáveis do tipo float;
		 P - Peso de tomates
		 E - Excesso de peso
		 M - Valor da multa*/
				
		Scanner input = new Scanner (System.in); // Criando o Scanner para ler os valores inseridos;
		
		System.out.println("\nDigite a quantidade de tomates em quilos: ");
		P = input.nextFloat(); 
		
		if(P > 50) 
		{
			E = P - 50;
			
			M = E * 4;
			
			System.out.printf("\nQuantidade: %.2fkg \nExcesso: %.2fKg \nMulta: R$ %.2f",P,E,M );
			
		}
		else
		{
			
			System.out.println("\nQuantidade: "+P+"Kg"+"\nExcesso: "+E+"Kg"+"\nMulta: R$"+M);
		}
		

	}

}
