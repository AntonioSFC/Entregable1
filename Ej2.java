package packageu1entregable1;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int numRandom = (int)(Math.random() * 25) +1;
		boolean acierto = false;
		
		System.out.println("¿Cuántos intentos desea realizar?");
		int numIntentos = tc.nextInt();
		
		System.out.println("¿Desea una ayuda a lo largo del juego?");
		System.out.println("1: Si");
		System.out.println("2: No");
		int guia =tc.nextInt();
		
		do {
			switch(guia) {
			case 1:
				for(int i = 1; i<=numIntentos;i++) {
					System.out.println("Adivine:");
					int eleccion = tc.nextInt();
					
						if(eleccion > numRandom) {
							int intentosRestantes = numIntentos--;
							System.out.println("Su número es mayor que el generado. Tiene "+intentosRestantes+" intentos restantes");
						} else if (eleccion < numRandom) {
							int intentosRestantes = numIntentos--;
							System.out.println("Su número es menor que el generado. Tiene "+intentosRestantes+" intentos restantes");
						} else if(eleccion == numRandom) {
							acierto = true;
							System.out.println("Enhorabuena, usted ha adivinado el número. Ha realizado"+numIntentos+" intentos");
						}
					} break;
			case 2:
				for(int i = 1; i<=numIntentos;i++) {
					System.out.println("Adivine:");
					int eleccion = tc.nextInt();
						if(eleccion > numRandom) {
							int intentosRestantes = numIntentos--;
							acierto = false;
						} else if (eleccion < numRandom) {
							int intentosRestantes = numIntentos--;
							acierto = false;
						} else if(eleccion == numRandom) {
							acierto = true;
							System.out.println("Enhorabuena, usted ha adivinado el número. Ha realizado"+numIntentos+" intentos");
						}
					} break;
			}
		} while(acierto == false);
			
	}
}		
	
