package Tema5;
import java.util.Random;
public class Matriz {
	public static void main(String[] args) {
		double [][] notas= new double[5][2];
		//n BB.DD
		notas[0][1]=1;
		notas[1][1]=3;
		notas[2][1]=7;
		notas[3][1]=8;
		notas[4][1]=6;
		//n programacion
		notas[0][0]=3;
		notas[1][0]=9;
		notas[2][0]=8;
		notas[3][0]=6;
		notas[4][0]=2;
		
		System.out.println("---------------- | Asignatura 1 | Asignatura 2 |");
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Alumno %d ",i);
				for (int j = 0; j < notas[i].length; j++) {
					System.out.print(notas[i][j]+"|");
					
				}
				System.out.println();
			}
		//rellenar
		/*
		 * 
		 * Random numAleatorio = new Random();
		
		 for (int i = 0; i < notas.length; i++) {
			System.out.println("");
			for (int j = 0; j < notas.length; j++) {
				notas[i][j]= numAleatorio.nextDouble(10);
			}
		}
		 */
		//recorrer
		/*
		   for (int i = 0; i < notas.length; i++) {
		   System.out.println("");
			for (int j = 0; j < notas.length; j++) {
				System.out.print(notas[i][j]);
			}
		}
		 */
	}
}
