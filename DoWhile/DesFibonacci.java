import java.util.Scanner;
public class DesFibonacci {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		long i=1, n, a=0, b=1, c=1;
		
		n=in.nextInt();
		
		do {
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
			i++;
			
		}while(i<=n);
		
		in.close();
	}

}