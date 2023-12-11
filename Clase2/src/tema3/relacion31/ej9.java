package tema3.relacion31;

import java.util.Scanner;

public class ej9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,radicando;
		
		System.out.println("Resolviendo ax² + bx + c = 0...");
		
		System.out.print("Introduce la a: ");
		a=Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la b: ");
		b=Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la c: ");
		c=Double.parseDouble(sc.nextLine());
		
		radicando = b*b - 4 * a * c;
		
		if((a==0) || (radicando<0)) {
			System.out.println("La ecuación no tiene solución");
		} else if(radicando == 0) {
			System.out.printf("x = %.2f\n",-b/(2*a));
		} else {
			double raiz = Math.sqrt(radicando);
			
			System.out.printf("x1 = %.2f\n",(-b+raiz)/(2*a));
			System.out.printf("x2 = %.2f\n",(-b-raiz)/(2*a));
		}
		sc.close();
	}

}
