import java.util.Scanner;
public class IPVA {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double n, ipva;
		
		System.out.println("Entre com o valor do ve�culo: ");
		n = leia.nextDouble();
		
		ipva = n/100*4;
		
		System.out.println("O valor do IPVA desse ve�culo �: R$"+ipva);
		in.close();
	}

}