package PortoSeguro;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		float base, altura, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nInsira o valor em cent�metros da base do tri�ngulo: ");
		base = input.nextFloat();
		
		System.out.println("\nInsira o valor em cent�metros da altura do tri�ngulo: ");
		altura = input.nextFloat();
		
		if(base > 0 && altura > 0)
		{
			area = (base * altura) / 2;
			
			System.out.printf("\nA �rea do tri�ngulo �: %.1f cm�",area);
		}
		else
		{
			System.out.println("\nValores inv�lidos! Por favor inserir n�meros positivos maiores que zero.");
		}

	}

}
