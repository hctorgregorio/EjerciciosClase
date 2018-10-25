package juego;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		//variable para recoger el dato del jugador
		Scanner sc = new Scanner(System.in);
		//contador del bucle
		int cont = 0;
		//declaracion de la variable aleatorio como un objeto random
		Random aleatorio = new Random();

		System.out.println("Este es el juego de piedra, papel o tijera\n 0 = piedra \n 1 = papel \n 2 = tijera");
		
		while (cont == 0) {
			
			System.out.println("Elige una opcion entre 0 y 2 incluidos");
			//recogemos el valor del jugador
			int jugador = sc.nextInt();
			//asignamos un valor entre 0 y 2 incluidos de manera aleatorio a la variable ordenador
			int ordenador = aleatorio.nextInt(3);
//
			if (jugador != ordenador) {
				switch (jugador) {
				case 0:
					if (ordenador == 2) {
						System.out.println("piedra gana a tijera, ganaste");
						break;
					}else {
						System.out.println("piedra pierde a papel, perdiste");
						break;
					}
				case 1:
					if (ordenador == 0) {
						System.out.println("papel gana a piedra, ganaste");
						break;
					}else {
						System.out.println("papel pierde a tijera, perdiste");
						break;
					}
				case 2:
					if (ordenador == 1) {
						System.out.println("tijera gana a papel, ganaste");
						break;
					}else {
						System.out.println("tijera pierde a piedra, perdiste");
						break;
					}
				}
				System.out.println("Si quieres terminar de jugar pulsa 1");
				cont = sc.nextInt();
			} else {	
				System.out.println("Has empatado, prueba a jugar otra vez");
			}
		}
		
		System.out.println("Fin del juego");

	}

}
