package PortoSeguro;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		float  N = 0, E = 0, salarioTotal = 0, salario = 0, HE = 0;
		int C = 0;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite seu c�digo: ");
		C = leia.nextInt();
		
		System.out.println("\nDigite o n�mero de horas trabalhadas: ");
		N = leia.nextFloat();
		
		HE = N - 50;
		salario = (N - HE) * 10;
		
			
		if(N > 50) 
		{
			E = (HE) * 20;
			
			salarioTotal = salario + E;
			
			System.out.printf("\nC�digo: %d \nSal�rio Total: R$ %.2f \nSal�rio excedente: R$ %.2f",C,salarioTotal,E);
		}
		else
		{
			salarioTotal = (N * 10) + E;
			System.out.printf("\nC�digo: %d \nSal�rio Total: R$ %.2f \nSal�rio excedente: R$ %.2f",C,salarioTotal,E);
		}
		
		
	}

}
