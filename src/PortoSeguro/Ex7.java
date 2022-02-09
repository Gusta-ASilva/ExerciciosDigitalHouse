package PortoSeguro;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		float base, altura, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nInsira o valor em centímetros da base do triângulo: ");
		base = input.nextFloat();
		
		System.out.println("\nInsira o valor em centímetros da altura do triângulo: ");
		altura = input.nextFloat();
		
		if(base > 0 && altura > 0)
		{
			area = (base * altura) / 2;
			
			System.out.printf("\nA área do triângulo é: %.1f cm²",area);
		}
		else
		{
			System.out.println("\nValores inválidos! Por favor inserir números positivos maiores que zero.");
		}

	}

}
