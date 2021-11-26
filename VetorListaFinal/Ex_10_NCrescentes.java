import java.util.Scanner;
public class Ex_10_NCrescentes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[] = new int[TAM];
		int i, j, b;

		for (i = 0; i < TAM; i++) {
			System.out.println("Entre com o " + (i + 1) + "º número que quer colocar em ordem crescente:");
			a[i] = in.nextInt();
		}

		for (i = 0; i < TAM; i++) {
			for (j = i; j < TAM; j++) {
				if (a[i] > a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}

		System.out.println(" Os elementos inseridos no vetor em ordem crescente é: ");
		System.out.print("[ ");

		for (i = 0; i < TAM; i++) {
			System.out.print(a[i] + "  ");
		}

		System.out.print("]");

		in.close();
	}
}