package tema3.relacion34;

import java.util.Scanner;

public class ej4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, ns = 0;
		System.out.print("Dame un numero secreto: ");
		ns = Integer.parseInt(sc.nextLine());

		do {
			System.out.println("Dime un numero: ");
			n = Integer.parseInt(sc.nextLine());

			if (n < ns)
				System.out.println("Es menor");
			else if (n > ns)
				System.out.println("Es mayor");
			else
				System.out.println("Acertaste");
		} while (n != ns);
		sc.close();
	}

}
class ej4b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, ns = 0;
		System.out.print("Dame un numero secreto: ");
		ns = Integer.parseInt(sc.nextLine());

		do {
			System.out.println("Dime un numero: ");
			n = Integer.parseInt(sc.nextLine());

			if (n < ns)
				System.out.println("Es menor");
			else if (n > ns)
				System.out.println("Es mayor");
			else
				System.out.println("Acertaste");
		} while (n != ns);
		sc.close();
	}
}
