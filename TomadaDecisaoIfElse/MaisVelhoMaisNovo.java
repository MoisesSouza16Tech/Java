import java.util.Scanner;
public class MaisVelhoMaisNovo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String nome, nomeVelho, nomeNovo;
		int idade, idadeVelho, idadeNovo;
		System.out.println("Entre com o 1º nome:");
		nome = in.next();
		System.out.println("Entre com a 1ª idade:");
		idade = in.nextInt();
		nomeVelho = nome;
		idadeVelho = idade;
		nomeNovo = nome;
		idadeNovo = idade;
		System.out.println("Entre com o 2º nome:");
		nome = in.next();
		System.out.println("Entre com a 2ª idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 3º nome:");
		nome = in.next();
		System.out.println("Entre com a 3ª idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 4º nome:");
		nome = in.next();
		System.out.println("Entre com a 4ª idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 5º nome:");
		nome = in.next();
		System.out.println("Entre com a 5ª idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("O mais velho é " + nomeVelho + " com " + idadeVelho + " anos.");
		System.out.println("O mais novo é " + nomeNovo + " com " + idadeNovo + " anos.");
		in.close();
	}
}
