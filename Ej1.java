package packageu1entregable1;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		final int numCons = 100;
		int suma = 0;
		boolean par = true;
		int mayor;
		int totalNums = 0;
		
		while(par != true && suma <100); {
			Scanner tc = new Scanner(System.in);
			System.out.println("Escriba tantos números enteros pares como desee");
			int numeroUsuario = tc.nextInt();
				if(numeroUsuario % 2 == 0) {
					for(int i=1;i<=numeroUsuario;i++) {
						totalNums++;
						int media = suma / totalNums;
						System.out.println("La media de todos los numeros exponencial es: "+media);
						System.out.println("El numero mayor de todos es: ");
					}
					suma = suma + numeroUsuario;
					par = true;
					}else if(numeroUsuario <= 0){
						System.out.println("El número que has introducido no es entero. Escriba de nuevo.");
						numeroUsuario = tc.nextInt();
						par = false;
						
					} else {
						System.out.println("El número que has introducido no es par. Escriba de nuevo");
						numeroUsuario = tc.nextInt();
						par = false;
					}
				
				
				
			} 
				 
				
				
		
		
		
		
	}
	
}
