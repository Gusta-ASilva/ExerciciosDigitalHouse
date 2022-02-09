package PortoSeguro;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4, q1, q2, q3, q4;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		n1 = input.nextFloat();
		
		System.out.println("\nDigite o segundo número: ");
		n2 = input.nextFloat();
		
		System.out.println("\nDigite o terceiro número: ");
		n3 = input.nextFloat();
		
		System.out.println("\nDigite o quarto número: ");
		n4 = input.nextFloat();
		
		q1 = Math.sqrt(n1);
		q2 = Math.sqrt(n2);
		q3 = Math.sqrt(n3);
		q4 = Math.sqrt(n4);
		
		if(q3 >= 1000) 
		{
			
			System.out.printf("\nQuadrado de: %.2f: %.2f !",n3,q3);
		}
		else
		{
			
			System.out.printf("\nQuadrado de: %.1f: %.1f \nQuadrado de: %.1f: %.1f "
					+ "\nQuadrado de: %.1f: %.1f \nQuadrado de: %.1f: %.1f",n1,q1,n2,q2,n3,q3,n4,q4);
		}

	}

}
