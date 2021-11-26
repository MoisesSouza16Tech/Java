public class Ex_4_Expoente {
	public static void main(String[] args) {
		int a[], i, Potencia = 1, n = 11; 
		a = new int[n];

	      for (i=0; i<n; i++) {
	        a[i] = Potencia;
	        System.out.println("2 elevado à "+i+" = "+Potencia);
            Potencia = Potencia * 2;
	      }
	 }
}