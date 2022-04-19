package fiap.tokio.exercicios;

import java.util.Scanner;

public class aula04Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("");
		System.out.print("Digite seu idade: ");
		idade = sc.nextInt();
		System.out.println("");
		sc.close();
		
		System.out.println("Olá, "+nome+", sua idade é "+idade+" anos.");

	}

}
