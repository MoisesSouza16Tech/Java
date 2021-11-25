import java.util.Scanner;
public class MediaAlunoAprovadoReprovado {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n1, n2, m, nExa, m2;
		System.out.println("Entre com a primeiro nota:");
		n1 = in.nextInt();
		System.out.println("Entre com a segunda nota:");
		n2 = in.nextInt();
		m = (n1 + n2) / 2;
		System.out.println("Sua média é " + m);
		if (m < 3) {
			System.out.println("Reprovado");
		} else if (m >= 6) {
			System.out.println("Aprovado, Parabéns!");
		} else {
			System.out.println("Aluno em Exame.");
		}
		System.out.println("Insira a nota obtida no Exame:");
		nExa = in.nextInt();
		m2 = (m + nExa) / 2;
		if (m2 >= 6) {
			System.out.println("Aprovado. Parabéns, pois essa foi por pouco!");
		} else {
			System.out.println("Reprovado, mesmo com exame obteve média insuficiente :(");
		}
		in.close();
	}
}
