package com.senati.eti;


import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lista de carreras:");
		System.out.println("\n- Desarrollo de Software (DS)");
		System.out.println("- Redes y conectividad (RC)");
		System.out.println("- Diseño Gráfico (DG)");

		float monto = 0, dscto = 0;
		
		System.out.print("\nIngrese la carrera [SIGLAS]: ");
		String titulo  = sc.nextLine();
		
		System.out.print("\nIngrese turno [M/T/N]: ");
		String turno  = sc.nextLine();
		
		if (titulo.equals("DS") || titulo.equals("ds")) {
			titulo = "Desarrollo de Software";
			monto = 1500;
		}

		else if (titulo.equals("RC") || titulo.equals("rc")) {
			titulo = "Redes y conectividad";
			monto = 1400;
		}

		else if (titulo.equals("DG") || titulo.equals("dg")) {
			titulo = "Diseño Gráfico";
			monto = 1300;
		}
		
		else {
			titulo = "No especificada";
			monto = 0;
		}
		
		if (turno.equals("M") || turno.equals("m")) {
			dscto = (float) (monto * 0.1);
			turno = "Mañana";
		}

		else if (turno.equals("T") || turno.equals("t")) {
			dscto = (float) (monto * 0.2);
			turno = "Tarde";
		}

		else if (turno.equals("N") || turno.equals("n")) {
			dscto = (float) (monto * 0.15);
			turno = "Noche";
		}
		
		else {
			turno = "Turno no especificado";
			dscto = monto;
		}
		
		
		System.out.println("\n... Resultados ...");
		System.out.println("Carrera.............: " + titulo);
		System.out.println("Monto...............: " + monto);
		System.out.println("Turno...............: " + turno);
		System.out.println("Descuento...........: " + dscto);
		System.out.println("Total...............: " + (monto-dscto));
		System.out.println("Total en Dólares....: " + ((monto-dscto)/3.33f));

	}

}
