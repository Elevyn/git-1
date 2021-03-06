package evaluacion2;

import java.util.Scanner;

public class ComplejoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo r1 = new Complejo(); // Llamada al constructor Complejo por defecto
		r1.escribir(); // Salida de texto por pantalla por Contructor
		
		Complejo r2 = new Complejo(3.0, 33.0); // Llamada al constructor Complejo por defecto
		r2.escribir(); // Salida de texto por pantalla por Contructor
		
		Complejo r3 = new Complejo(3.0); // Llamada al constructor Complejo por defecto
		r3.escribir(); // Salida de texto por pantalla por Contructor
		
		Complejo r4 = new Complejo(r2); // Llamada al constructor Complejo por defecto
		r4.escribir(); // Salida de texto por pantalla por Contructor

		// Getters
		double r;
		r = r2.getReal(); // r = 2.0
		System.out.println("Real: "+ r); // Salida de texto por pantalla
		r4.setReal(4.0);
		
		// Setters
		double i;
		i = r2.getImaginario();
		System.out.println("Imaginario: "+ i); // Salida de texto por pantalla
		r4.setImaginario(44.0); // 4.0 + 44.0i
		System.out.println(r4); // Salida de texto por pantalla
				
		// Comprobacion facil
		if (r4.equals(r2)) {
			// Si son iguales
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son diferentes");
		}
		
		// compareTo
		if (r4.compareTo(r2) > 0) {
			System.out.println(r4 + " es MAYOR que "+ r2);
		}
		else if (r4.compareTo(r2) < 0) {
			System.out.println(r4 + " es MENOR que "+ r2);
		}
		else {
			System.out.println(r4 + " es IGUAL que "+ r2);
		}
		
		// leer
		Scanner teclado = new Scanner (System.in);
		
		// leer r1
		r1.leer(teclado);
		System.out.println("Complejo leido" + r1);
		
		// cerrar teclado
		teclado.close();
	}

}
