import java.util.Scanner;
public class MaisVelhoMaisNovo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String nome, nomeVelho, nomeNovo;
		int idade, idadeVelho, idadeNovo;
		System.out.println("Entre com o 1� nome:");
		nome = in.next();
		System.out.println("Entre com a 1� idade:");
		idade = in.nextInt();
		nomeVelho = nome;
		idadeVelho = idade;
		nomeNovo = nome;
		idadeNovo = idade;
		System.out.println("Entre com o 2� nome:");
		nome = in.next();
		System.out.println("Entre com a 2� idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 3� nome:");
		nome = in.next();
		System.out.println("Entre com a 3� idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 4� nome:");
		nome = in.next();
		System.out.println("Entre com a 4� idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("Entre com o 5� nome:");
		nome = in.next();
		System.out.println("Entre com a 5� idade:");
		idade = in.nextInt();
		if (idade > idadeVelho) {
			idadeVelho = idade;
			nomeVelho = nome;
		} else if (idade < idadeNovo) {
			idadeNovo = idade;
			nomeNovo = nome;
		}
		System.out.println("O mais velho � " + nomeVelho + " com " + idadeVelho + " anos.");
		System.out.println("O mais novo � " + nomeNovo + " com " + idadeNovo + " anos.");
		in.close();
	}
}
