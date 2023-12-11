package buclesRepaso;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		int n=0,nt,in = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Cuantas ventas tenemos: ");
		n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			System.out.print("cuantos vendemos: ");
			nt = Integer.parseInt(sc.nextLine());
			in = in + nt;
		}
		System.out.println("suma de todas las ventas: " + in);
		sc.close();
	}
	
}
