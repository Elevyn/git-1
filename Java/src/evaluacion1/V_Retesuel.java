package evaluacion1;

import java.util.Scanner;

public class V_Retesuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Iniciamos la variable del n�mero entero		
		double num, resultado = 0;
				
		// Para que la consola lea lo que introducimos por teclado
		// Creamos la clase Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Pedimos el numero real A
		System.out.println("Inserta el sueldo del trabajador: ");
		num = teclado.nextInt();
		
		// Cerramos teclado
		teclado.close();
		
		// Empezamos con las condiciones
		if (num < 1000.00) {
			resultado = (num * 10 / 100);
		}
				
		else if(num == 1000.00) {
			resultado = (num * 12 / 100);
		}
				
		else if (num > 1000.00) {
			resultado = (num * 14 / 100);
		}
		
		// Sacamos el resultado
		System.out.printf("\nLa retenci�n del trabajador es %.2f�", resultado);
		
	}

}
