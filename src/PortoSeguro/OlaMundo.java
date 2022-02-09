package PortoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade = 24,x, y;
		double altura, nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in); // ler dados digitados pelo usuário;
		
		System.out.println("Olá, Mundo!");
		
		System.out.println("\nEntre com o seu nome: ");
		nome = leia.nextLine(); //Estou pegando a entrada do meu usuário;
		
		System.out.println("\nEntre com sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		if(media >=7 && media <=10) {
			
			System.out.println("\n Aluno aprovado!!!");
		}
		else if(media>=5 && media<7) {
			
			System.out.println("\nAluno de exame!");
		}
		else if(media>=0 && media<5){
			
			System.out.println("\nAluno reprovado!");
		}
		else {
			
			System.out.println("\nMédia inválida!!!");
		}
		
		System.out.println("\nMeu nome é: " +nome+
				" Eu tenho: "+idade+
				" anos e minha altura é: "+altura+"m");
		
		System.out.printf("\nMédia aritmética: %2.2f",media);
		
		nota1 = Math.sqrt(nota2); //raiz quadrada;
		nota2 = Math.pow(nota3, 3); //potencia;
		
		System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
		
		x = x % y; //calcula o resto da divisão de dois números inteiros
		
		
	}

}
