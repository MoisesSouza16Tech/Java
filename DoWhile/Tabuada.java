import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, n, r;
		System.out.println("Entre com o número para obter a tabuada");
		n = in.nextInt();
		do {
			r = n*1;
			System.out.println(n+"x"+i+" = "+r);
			i++;
		}while(i<=10);
		in.close();
	}

}
