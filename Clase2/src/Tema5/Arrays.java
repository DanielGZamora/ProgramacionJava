package Tema5;

public class Arrays {
	public static void arrayNormal() {
		int[] numeros = {1,2,3}; 
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[0]);
		}
	}
	public static void arrayMultidimensional() {
		int[][] numeros = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		}; 
		for (int i = 0; i < numeros.length; i++) {
			System.out.println();
			for (int j = 0; j < numeros.length; j++) {
				System.out.print(numeros[i][j]);
			}
		}
	}
	public static void main(String[] args) {
		arrayMultidimensional();
	}
	
}
