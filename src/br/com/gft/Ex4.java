package br.com.gft;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para x: ");
		int x = sc.nextInt();

		do {

			if (x % 2 == 0) {
				x = x / 2;
				if (x == 1) {
					System.out.print(x + ".");
				}else {
					System.out.print(x + " -> ");
				}
			} else {
				x = 3 * x + 1;
				System.out.print(x + " -> ");
			}

		} while (x != 1);

	}
}
