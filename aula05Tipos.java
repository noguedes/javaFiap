package fiap.tokio.exercicios;

public class aula05Tipos {

	public static void main(String[] args) {
		
		float preco = 10.99f; // forma 1 de declarar float 
		float preco2 = (float) 2.99; // forma 2 de declarar float 
		
		System.out.println("Coquinha R$"+preco);
		System.out.println("Docinho jujuca R$"+preco2);
		
		char letra = 'M';
		System.out.println(letra);
		// declarando variável char
		
		boolean ligado = true;
		System.out.println(ligado);
		
		boolean desligado = (boolean) false;
		System.out.println("Coquinha vale R$2,50? "+desligado);
		//declarando variável boolean
		
		double precodouble = 10.99;
		System.out.println(precodouble);
		//declarando variável double
	}

}
