import java.util.Scanner;
public class Ex_6_Interseccao {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[], b[], c[], i, j, k = 0;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		
		//lendo o vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("DIgite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}
		
		//lendo o vetor B
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			b[i] = in.nextInt();
			}
		
		//verificando as intersecções
		boolean encontrado;
		for (i=0; i<TAM; i++) {
			encontrado = false;
		
			for(j=0;j<TAM;j++) {
				if (a[i] == b[j]) {
					encontrado = true;
				}
			} 
			if(encontrado == true) {
				c[k] = a[i];
				k++;
			}
		}	
		
		//exibindo o vetor A
		System.out.print("\nA = ");
		for(k=0; k<TAM; k++) {
			System.out.print(a[k]+" ");
		
		}
		
		//exibindo o vetor b
		System.out.println();
		System.out.print("\nB = ");
		for(k=0; k<TAM; k++) {
			System.out.print(b[k]+" ");
		
		}
			
		
		//exibindo o vetor C
		System.out.println();
			System.out.print("\nC = ");
			for(k=0; k<TAM; k++) {
				System.out.print(c[k]+" ");
			
			}
		
	}
	
	
}