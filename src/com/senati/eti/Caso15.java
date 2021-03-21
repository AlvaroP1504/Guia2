package com.senati.eti;

import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lista de productos:          Formas de pago:");
		System.out.println("- Tablet (TB)                - Contado [C1]");
		System.out.println("- Laptop (LT)                - Crédito [C2]");
		System.out.println("- Monitor (MN)");
		System.out.println("- Impresora (IM)");
		
		System.out.print("\nIngrese nombre....: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese producto [SIGLAS]..: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese cantidad..: ");
		int cant = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("\nIngrese forma de pago [C1/C2]..: ");
		String forma_p = sc.nextLine();
		
		float dscto = 0, monto = 0, total = 0, p_final = 0;
		
		if (producto.equals("TB") || producto.equals("tb")) {
			producto = "Tablet";
			monto = 350;
		}

		else if (producto.equals("LT") || producto.equals("lt")) {
			producto = "Laptop";
			monto = 2300;
		}

		else if (producto.equals("mn") || producto.equals("MN")) {
			producto = "Monitor";
			monto = 850;
		}

		else if (producto.equals("IM") || producto.equals("im")) {
			producto = "Impresora";
			monto = 680;
		}
		
		else {
			producto = "No especificada";
			monto = 0;
		}
		
		total = monto * cant;
		
		if (forma_p.equals("C1") || forma_p.equals("c1")) {
			dscto = (float) (total * 0.05);
			forma_p = "Forma de pago.: Contado\nDescuento.....: ";
			p_final = total - dscto;
			
		}

		else if (forma_p.equals("C2") || forma_p.equals("c2")) {
			dscto = (float) (total * 0.12);
			forma_p = "Forma de pago.: Crédito\nAumento.......: ";
			p_final = total + dscto;
		}
		
		else {
			forma_p = "Pago no especificado";
			dscto = total;
		}
		
		
		

		System.out.println("\n... R E S U M E N ...");
		System.out.println("Cliente.......: " + nombre);
		System.out.println("Producto......: " + producto);
		System.out.println("Cantidad......: " + cant);
		System.out.println("Precio........: " + monto);
		System.out.println("Total.........: " + total);
		System.out.println(forma_p + dscto);
		System.out.println("A pagar.......: " + p_final);
	}

}
