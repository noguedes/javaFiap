package fiap.tokio.exercicios;

import java.util.Scanner;

public class aula04Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Informe seu salario: ");
		salario = sc.nextDouble();
		System.out.println("Seu salário: "+salario);
		sc.close();

	}

}
