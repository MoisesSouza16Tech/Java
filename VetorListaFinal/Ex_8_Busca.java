import java.util.Scanner;

public class Ex_8_Busca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int a[], i, j, b = 0;
		a = new int[TAM];

		// Lendo os valores do vetor A
		for (i = 0; i < TAM; i++) {
			System.out.println("Entre " + (i + 1) + " valor do vetor A:");
			a[i] = in.nextInt();
		}

		// Verificando se X est� contido em A
		for (j = 0; j < 1; j++) {
			System.out.println("Entre com o n�mero que quer buscar");
			b = in.nextInt();
		}

		// Verificando se elemento(i) � igual a B
		boolean encontrado=false;
		for (i = 0, j = 0; i < TAM; i++, j++) {
			if (a[i] == b) {
				encontrado = true;
			} 

		}

		// Exibindo se b esta ou n�o contido em A
		if (encontrado == true) {
			System.out.println("O valor " + (b) + " est� contido no vetor A");
		} else if (encontrado == false) {
			System.out.println("O valor " + (b) + " n�o est� contido no vetor A");
		}

	}
}
