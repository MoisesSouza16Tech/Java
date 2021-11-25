import java.util.Scanner;
public class IPVA {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double n, ipva;
		
		System.out.println("Entre com o valor do veículo: ");
		n = leia.nextDouble();
		
		ipva = n/100*4;
		
		System.out.println("O valor do IPVA desse veículo é: R$"+ipva);
		in.close();
	}

}