package cuadrado;

import java.util.Scanner;



public class CiclosCuadrado {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0, resultado;
		
		while (numero>=0) {
			System.out.println("Introduce un n�mero");
		
			numero= entrada.nextInt();
			resultado = (int) Math.pow(numero, 2);
			
			System.out.println("El cuadrado del n�mero "+numero+" es: " + resultado);

	}

}}
