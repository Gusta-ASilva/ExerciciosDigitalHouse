package PortoSeguro;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		float indicePoluicao;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nInsira o índice de poluição medido: ");
		indicePoluicao = input.nextFloat();
		
		if(indicePoluicao >= 0.3 && indicePoluicao <= 0.39) 
		{
			System.out.println("\nGrupo 1, suspender as atividades imediatamente!");
		}
		
		else if (indicePoluicao < 0.3)
		{
			System.out.println("\nÍndice de poluição aceitável.");
		}
		
		if(indicePoluicao >= 0.4 && indicePoluicao <= 0.499) 
		{
			System.out.println("\nGrupos 1 e 2, suspender as atividades imediatamente!");
		}
		
		if(indicePoluicao >= 0.5) 
		{
			System.out.println("\nTodos os grupos encerrar as atividades imediatamente!");
		}
		
	}

}
