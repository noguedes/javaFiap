package fiap.tokio.exercicios;

import java.util.Scanner;

public class aula04Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		System.out.print("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.println(nome);
		sc.close();

	}

}
