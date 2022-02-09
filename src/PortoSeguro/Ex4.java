package PortoSeguro;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nDigite um número inteiro: ");
		numero = input.nextInt();
		
		if(numero % 2 == 0) 
		{
			
			if(numero >= 0) 
			{
				System.out.println("\nEste número é par e positivo!");
			}
			else 
			{
				System.out.println("\nEste número é par e negativo!");
			}
		}
		else 
		{
			if(numero >= 0) 
			{
				System.out.println("\nEste número é ímpar e positivo!");
			}
			else
			{
				System.out.println("Este número é ímpar e negativo!");
			}
		}

	}

}
