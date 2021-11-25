import java.util.Scanner;
public class VetorInvertido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j, a[], b[];
		a = new int[5];
		b = new int[5];

		j = 4;
		for (i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + " elemento do vetor");
			a[i] = in.nextInt();
			b[j] = a[i];
			j--;

		}
		System.out.print("\nVetor A [ ");
		for (i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ] ");

		System.out.print("\nVetor B [ ");
		for (i = 0; i < 5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print(" ] ");
	}
}
