package fiap.tokio.exercicios;

import java.util.Scanner;

public class aula05Manipulacao {

	public static void main(String[] args) {
		
		double salario = 1212.50;
		String salarioStr = Double.toString(salario);
		//Convertendo numero para string. Recebe um numero e printa uma string 
		
		System.out.println(salarioStr);
		
		String valortxt = "10.99";
		double valor = Double.parseDouble(valortxt);
		System.out.println(valor);
		//Covertendo string para numero 
		
		double meuDouble = 9.99d;
		int meuInt = (int) meuDouble;
		System.out.println(meuDouble);
		System.out.println(meuInt);
		//Usando typecast para mostrar apenas a parte inteira do meu double
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		String numTexto = sc.nextLine();
		
		float num = Float.parseFloat(numTexto);
		System.out.println(num);
		//Transformando um valor que foi digitado que é string, transformando ele para número
		
		sc.close();
	}

}
