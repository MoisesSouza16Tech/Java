import java.util.Scanner;
public class ProdutoDesconto {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double p, desc, r;
		
		System.out.println("Digite o valor do produto: ");
		p = leia.nextDouble();
		
		System.out.println("Digite o valor do desconto: ");
		desc = leia.nextDouble();
		
		n = p-p/100*desc;
		
		System.out.println("O valor do produto com o desconto é: R$"+n);
		in.close();
	}

}