import java.util.Scanner;
public class MaiorNumero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, y = 1, n, valor, maior = 0;                                                                                        
		do {
			System.out.println("Entre com o número de valores a saber o maior:");
			n = in.nextInt();
			while (y <= n) {
				System.out.println("Digite os valores que quer comparar");												
				valor = in.nextInt();
				if (valor > maior) {
					maior = valor;
				} else {
					maior = maior * 1;
				}
				y++;
			}
			if (n > 0) {
				System.out.println(maior + " foi o maior número.");
				i++;
				y = 1;
				maior = 0;
			} else {
				maior = 0;
			}
		} while (n > 0);
		System.out.println("Fim do programa");

		in.close();
	}
}


