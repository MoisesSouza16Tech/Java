import java.util.Scanner;
public class Ex_1_ParImpar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], i, ContPar = 0, ContImpar = 0;
		a = new int[20];

		for (i = 0; i < 20; i++) {
			System.out.println("Digite o " + (i + 1) + "� n�mero:");
			a[i] = in.nextInt();
			if (a[i] % 2 == 0) {
				ContPar++;
			} else {
				ContImpar++;
			}
		}
		System.out.println("Temos " + ContPar + " n�meros pares.");
		System.out.println("E temos " + ContImpar + " n�meros �mpares.");
		int par[], impar[];
		par = new int[ContPar];
		impar = new int[ContImpar];

		int Ipar = 0;
		int Iimpar = 0;
		for (i = 0; i < 20; i++) {
			if (a[i] % 2 == 0) {
				par[Ipar] = a[i];
				Ipar++;
			} else {
				impar[Iimpar] = a[i];
				Iimpar++;
			}
		}
		System.out.print("O vetor com os n�meros originais: [");
		for (i = 0; i < 20; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
		System.out.println();

		System.out.print("O vetor com os n�meros pares: [");
		for (i = 0; i < ContPar; i++) {
			System.out.print(par[i] + " ");
		}
		System.out.print("]");
		System.out.println();

		System.out.print("O vetor com os n�meros �mpares: [");
		for (i = 0; i < ContImpar; i++) {
			System.out.print(impar[i] + " ");
		}
		System.out.print("]");
		in.close();
	}
}