package Tema4.ejemplos;

public class EjemploModulo {
	public static void main(String[] args) {
		int varia = 0;
		
		for (int i = 1; i <= 1000; i++) {
			varia = (varia + 1)%10;
			System.out.printf("Vuelta %d | Variable %d\n",i,varia);
		}
	}
}
