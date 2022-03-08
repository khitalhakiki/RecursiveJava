import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FaktorialRekursifOutput {

	public static void main(String[] args) throws Exception {
//		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		int n, b;
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Bilangan Faktorial :");
//		a = Integer.parseInt(x.readLine());
		n = Integer.parseInt(x.readLine());

//		System.out.print(a);
		System.out.print(n);
		System.out.println("!");

//		ulang(a);
		repeatOutput(n);
		System.out.println("");
//		faktor(a);
		Faktorial(n);

//		System.out.println("hasil = " + (faktor(a)));
		System.out.println("hasil = " + Faktorial(n));
	}

//	static void ulang(int a) {
//		for (int i = a - 1; i > 0; i--) {
//			for (int j = a; j >= i; j--) {
//				System.out.print(j);
//				if (j == i) {
//					System.out.print("");
//				} else {
//					System.out.print(" x ");
//				}
//			}
//
//			System.out.println("");
//		}
//	}
	
	static void repeatOutput (int n) {
		for (int i= n - 1; i > 0; i--) {
			for(int j=n; j>=i; j--) {
				System.out.print(j);
				if(j == i) {
					System.out.print("");
				} else {
					System.out.print(" x ");
				}
			}
			
			System.out.println("tampilan perulangan luar");
		}
	}

	static int Faktorial(int n) {
		if (n == 0) {
			return (1);
		} else {
			return (n * Faktorial(n - 1));
		}
	}
}