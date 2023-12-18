package ej.trabajoGrupo;

import java.util.Random;
/**
 * @author Dani
 */

public class DanielGarcia {
	/**
	 * crea un numero random dentro de un rango. ej un numero del 1 al 5
	 * @param el numero minimo por el que puede empezar. ej 1
	 * @param el numero maximo que puede llegar a ser. ej 5
	 * @return el numero aleatorio. ej un numero entre el 1 y el 5
	 */
	public int numeroRandom(int minimo,int maximo) {
		Random random=new Random();
		int nRandom = (int) (random.nextInt(maximo - minimo+1)+minimo);
		
		
		return nRandom;
	}
	/*
	 * Este metodo recibe el nombre y la edad de una persona y devuelve si es mayor de edad o no
	 */
	public void pruebaEdad(String nombre, int edad) {
		if(edad>=18) {
			System.out.println("es mayor de edad");
		} else {
			System.out.println("es menor de edad");
		}
	}

}
