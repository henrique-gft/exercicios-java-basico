package br.com.gft;

public class Ex3 {

	public static void main(String[] args) {
		// Imprima os fatoriais de 1 a 6.

		int fatorial = 1;

		for (int i = 0; i <= 10; i++) {

			if (i == 0 || i == 1) {
				System.out.println("O fatorial de [" + i + "] " + "é igual a: " + fatorial);
			} else {
				fatorial = fatorial * i;
				System.out.println("O fatorial de [" + i + "] " + "é igual a: " + fatorial);
			}

		}

	}

}
