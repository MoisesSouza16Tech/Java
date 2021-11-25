
public class MultiplosdeDez {
	public static void main(String[] args) {
		
		int i=0, result;
		
		do {
			result = i % 10;
			
			if (result == 0){
				System.out.println(i+" - Múltiplo de 10");
			}else {
				System.out.println(i);
			}
		i++;	
		}while (i<301);
	}

}

////import java.util.Scanner;
//public class MultiplosdeDez {
//
//	public static void main(String[] args) {
////		Scanner in = new Scanner(System.in);
//		int i=1, result;
////		System.out.println("Entre com o número para verificar se é multiplo de 10:");
////		i = in.nextInt();
//		
//		while (i<301){
//			
//		
//			result = i % 10;
//			
//			if (result == 0){
//				System.out.println(i+" - Múltiplo de 10");
//			}else {
//				System.out.println(i);
//			}
//			i++;
//		}
////	in.close();
//	}
//
//}