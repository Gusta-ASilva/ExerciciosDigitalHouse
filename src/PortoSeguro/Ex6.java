package PortoSeguro;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int op, idade;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n\tQual a sua idade?");
		System.out.println("\n 1 - 5 a 7 anos");
		System.out.println("\n 2 - 8 a 11 anos");
		System.out.println("\n 3 - 12 a 13 anos");
		System.out.println("\n 4 - 14 a 17 anos");
		System.out.println("\n 5 - Maior de 18 anos");
		System.out.println("\nEntre com a sua opção: ");
		op = input.nextInt();
		
		switch(op) 
		{
		case 1:
			System.out.println("\nVocê está na categoria: Infantil A");
			break;
			
		case 2:
			System.out.println("\nVocê está na categoria: Infantil B");
			break;
			
		case 3:
			System.out.println("\nVocê está na categoria: Juvenil A");
			break;
			
		case 4:
			System.out.println("\nVocê está na categoria: Juvenil B");
			break;
			
		case 5:
			System.out.println("\nVocê está na categoria: Adultos");
			break;
			
		default:
			System.out.println("\nOpção inválida!");
		
		}
		

	}

}
