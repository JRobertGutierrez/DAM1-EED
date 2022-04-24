package tema_3;

import java.util.Random;

/** 
 *   Ejemplo para depurar. Este ejercicio debe: - Rellenar un array con 10
 *   n�meros - Los n�meros deben ir del 1 al 100 - Encontrar el m�ximo
 *   y m�nimo de los n�meros generados
 * 
 *   Ejercicio: - Encontrar posibles errores en el c�digo. - Ayuda:
 *   Existen 3 errores - Ayuda: Entiende el programa antes de ponerte a
 *   depurar
 */
public class Ejercicio1 {
	/**
	 * Clase Ejercicio1
	 *
	 * IMPORTANTE: Este fichero me lo pasaron para estudiarmelo, me ha parecido muy
	 * interesante y por eso lo comparto
	 */	
	public static void main(String[] args) {
		// generamos un array aleatorio con numeros
		int[] arrNumeros = generarNumeros();
		// imprime los n�meros sorteados
		print2Console("N�meros sorteados: ", arrNumeros);
		// imprime el m�ximo
		System.out.println("M�ximo:" + max(arrNumeros));
		// imprime el m�nimo
		System.out.println("M�nimo:" + min(arrNumeros));
	}

	/**
	 * Genera aleatoriamente diez n�meros
	 * 
	 * @return Los n�meros generados
	 */
	private static int[] generarNumeros() {
		Random random = new Random();
		int[] arrNumeros = new int[10];
		// sortea 10 n�meros del 0 al 99
		for (int i = 0; i < arrNumeros.length; i++) {
			arrNumeros[i] = random.nextInt(100);
		}
		return arrNumeros;
	}

	/**
	 * Imprime por la consola el texto message seguido de los n�meros del array
	 * arrNumeros separados por espacios
	 * 
	 * @param message    El mensaje a ser mostrado
	 * @param arrNumeros Los n�meros a ser impresos
	 */
	private static void print2Console(String message, int[] arrNumeros) {
		System.out.print(message);
		for (int number : arrNumeros) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

	/**
	 * retorna el m�ximo de los n�meros
	 * 
	 * @param arrNumeros Los n�meros donde buscar el m�ximo
	 * @return El n�mero m�ximo
	 */
	private static int max(int[] arrNumeros) {
		int max = 0;
		for (int number : arrNumeros) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}

	/**
	 * retorna el m�nimo de los n�meros
	 * 
	 * @param arrNumeros Los n�meros donde buscar el m�nimo
	 * @return El n�mero m�nimo
	 */
	private static int min(int[] arrNumeros) {
		int min = arrNumeros[0];
		for (int number : arrNumeros) {
			if (min > number) {
				min = number;
			}
		}
		return min;
	}
}