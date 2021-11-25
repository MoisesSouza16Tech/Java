import java.util.Scanner;
public class AlunoMaiorMenor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 1, idade, menor = 0, maior = 0;
		while (i < 11) {
			System.out.println("Entre com a idade do " + i + "º aluno:");
			idade = in.nextInt();
			if (idade < 18) {
				menor = menor + 1;
			} else {
				maior = maior + 1;
			}
			i++;
		}
		System.out.println(menor + " alunos são menores de idade e " + maior + " são maiores de idade");
		in.close();
	}

}

