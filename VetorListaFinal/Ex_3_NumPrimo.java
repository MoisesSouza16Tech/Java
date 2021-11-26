import java.util.Scanner;
public class Ex_3_NumPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, Resto = 0, a[];
		a = new int[10];
		
		for (int j=0; j<10; j++) {
			Resto = 0;
			System.out.println("Insira um número: ");
			a[j] = in.nextInt();

			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					Resto++;
				}
			}

			if (Resto > 2) {
				System.out.println("Esse número não é primo.");
			}else {
				System.out.println("Esse número é primo.");
			}
		} in.close();
	}
}