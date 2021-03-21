package com.senati.eti;

import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese sueldo: ");
		int n1 = sc.nextInt();

		float impuesto = 0;
		
		if (n1 > 2800)
			impuesto = n1 * 0.05f;
		else
			impuesto = n1 * 0.02f;

		System.out.println("Impuesto calculado: " + impuesto);

	}

}
