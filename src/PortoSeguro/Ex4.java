package PortoSeguro;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nDigite um n�mero inteiro: ");
		numero = input.nextInt();
		
		if(numero % 2 == 0) 
		{
			
			if(numero >= 0) 
			{
				System.out.println("\nEste n�mero � par e positivo!");
			}
			else 
			{
				System.out.println("\nEste n�mero � par e negativo!");
			}
		}
		else 
		{
			if(numero >= 0) 
			{
				System.out.println("\nEste n�mero � �mpar e positivo!");
			}
			else
			{
				System.out.println("Este n�mero � �mpar e negativo!");
			}
		}

	}

}
