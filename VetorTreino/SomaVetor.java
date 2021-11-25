import java.util.Scanner;
public class SomaVetor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; //constante com valor 10
		int i, a[], b[], c[];
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//leitura dos vetores A e B
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o valor do A:");
			a[i] = in.nextInt();
			System.out.println("Entre com o "+(i+1)+"o valor do B:");
			b[i] = in.nextInt();
			
			c[i] = a[i] + b[i];
		}
		
		//apresentação do vetor C
		System.out.println("Apresentação do Vetor C:");
		System.out.print("c[] = {");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+", ");
		}
		System.out.print("};");
		
		in.close();
		
	}

}