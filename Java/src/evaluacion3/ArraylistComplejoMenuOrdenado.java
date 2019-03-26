package evaluacion3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistComplejoMenuOrdenado {

	public static void main(String[] args) {
		
		// Necesidades previas
		Complejo valor = new Complejo();
		ArrayList<Complejo> alcomplejo = new ArrayList<Complejo>();
		int opcion;
		
		// CREAR OBJETO SCANNER
		Scanner teclado;
		teclado = new Scanner(System.in);
	    
		// OPCIONES A MOSTRAR EN PANTALLA
		System.out.println("<-- Opciones -->");
		System.out.println("1. A�adir n�mero.");
		System.out.println("2. Buscar n�mero.");
		System.out.println("3. Borrar n�mero.");
		System.out.println("4. Listar numeraci�n.");
		System.out.println("5. Salir.");
		
		// LEER OPCION
		System.out.println("Opcion --> ");
	    opcion = teclado.nextInt();
	    
	    while (opcion != 0) {
		    	
			switch(opcion) {  // En caso de...
				
				case 1: {  // ...
					// LIMPIAR BUFFER
					teclado.nextLine();
					// LEER CADENA
					System.out.println("A�ADIR N�MERO: ");
					valor.leer(teclado);
					
					if (!alcomplejo.contains(valor)) {
						// A�ADIR LA CADENA AL ARRAYLIST
						alcomplejo.add(new Complejo(valor));
						
						System.out.println("El n�mero ( "+ valor + " ) se ha a�adido.");
					}
					else {
						System.out.println("Ese n�mero ya existe.");
					}
					
					break;
				}
			
				case 2: {  // ...
					// LIMPIAR BUFFER
					teclado.nextInt();
					// LEER CADENA
					System.out.println("BURCAR N�MERO: ");
					valor.leer(teclado);
					
					if (alcomplejo.contains(valor)) {
						// A�ADIR LA CADENA AL ARRAYLIST
						System.out.println("El n�mero que has buscado es: " + valor);
					}
					else {
						System.out.println("Ese n�mero ( " + valor + " ) no existe.");
					}	
					break;
				}

				case 3: {  // ...
					// LIMPIAR BUFFER
					teclado.nextInt();
					// LEER CADENA
					System.out.println("BORRAR N�MERO: ");
					valor.leer(teclado);
					
					if (alcomplejo.contains(valor)) {
						System.out.println("El n�mero ( " + valor + " ) ha sido borrado.");
						// BORRAR LA PALABRA BUSACADA
						alcomplejo.remove(valor);
					}
					else {
						System.out.println("Ese numero ( " + valor + " ) no existe.");
					}
				
					break;
				}

				case 4: {  // ...
					// Para ordenar un ArrayList de menor a mayor podemos usar el m�todo sort
					// de la clase Collections.
					Collections.sort(alcomplejo);
						
					// SALIDA DEL DICCIONARIO ORDENADO
					for (int posicion=0; posicion < alcomplejo.size(); posicion++) {
						System.out.println(alcomplejo.get(posicion));
					}
						
					break;
				}
				
				case 5: {  // ...
					// Salir del programa
					System.exit(0);
					break;
				}
			
			}
			
			// LEER OPCION
			System.out.println("Opcion --> ");
		    opcion = teclado.nextInt();
	    }
	    
		// BORAR MEMORIA DEL TECLADO
		teclado.close();
			
	}

}
