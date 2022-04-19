package fiap.tokio.exercicios;

public class aula05SaidaDeDados {

	public static void main(String[] args) {
		
		float nota = 9.5f;
		String nome = "Arthur";
		int numtel = 969271551;
		
		System.out.println("O Miguel tirou "+nota);
		System.out.printf("O Miguel tirou %.2f \n",nota);
		System.out.format("O Miguel tirou: %.2f",nota);
		
		System.out.printf("O aluno %s de telefone, %d, tirou uma nota de: %.2f", nome, numtel, nota);
		//para declarar int usamos %d
	}

}
