package PortoSeguro;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		float N;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nDigita um n�mero: ");
		N = input.nextFloat();
		
		if(N > 100) 
		{
			System.out.println("\nValor da vari�vel N: " + N);
		}
		else
		{
			N = 0;
			System.out.println("Valor da vari�vel N: " + N);
		}
		

	}

}
