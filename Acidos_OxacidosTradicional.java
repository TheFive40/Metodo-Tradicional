package MetodoTradicional;

import java.util.Scanner;

public class Acidos_OxacidosTradicional {
public void Acidos_Oxacidos() {
	System.out.println(" -------------------------------------------------- ");
	System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de los Acidos Oxacidos");
	System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?");
	System.out.println("\n1: Caso 1 \n2: Caso 2 \n3: Caso 3");
	
	Scanner entrada = new Scanner (System.in);
	int Caso = entrada.nextInt();
	
	if(Caso == 1) {
		System.out.println("A continuacion la Lista de Hidruros Programados");
		String [] Oxacidos = new String [6];
		Oxacidos [0] = "[0] H2CO2";
		Oxacidos [1] = "[1] H2CO3";
		Oxacidos [2] = "[2] H2SeO2";
		Oxacidos [3] = "[3] H3PO3";
		Oxacidos [4] = "[4] H3PO4";
		Oxacidos [5] = "[5] H2SeO4";
		
		for(int i = 0;i<6;i++) {
			System.out.println(Oxacidos[i]);
		}
		
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		if (Eleccion == 0) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");
			
			System.out.println("Es un Acido Carbonoso");		
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Carbonico");
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Selenico");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Fosforoso");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Fosforico");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Selenico");
		}
	}else if (Caso == 2) {
		System.out.println("A continuacion la Lista de Hidruros Programados");
		String [] Oxacidos = new String [6];
		Oxacidos [0] = "[0] H2SO2";
		Oxacidos [1] = "[1] H2SO3";
		Oxacidos [2] = "[2] H2SO4";
		Oxacidos [3] = "[3] H2TeO2";
		Oxacidos [4] = "[4] H2TeO3";
		Oxacidos [5] = "[5] H2TeO4";
		for(int i = 0;i<6;i++) {
			System.out.println(Oxacidos[i]);
		}
		
		
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		if (Eleccion == 0) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");
			
			System.out.println("Es un Acido HipoSulfuroso");		
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Acido Sulfuroso");
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Sulfurico");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido HipoTeluroso");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Teluroso");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Telurico");
		}
	}else if (Caso == 3) {
		System.out.println("A continuacion la Lista de Hidruros Programados");
		String [] Oxacidos = new String [8];
		Oxacidos [0] = "[0] HClO";
		Oxacidos [1] = "[1] HClO2";
		Oxacidos [2] = "[2] HClO3";
		Oxacidos [3] = "[3] HClO4";
		Oxacidos [4] = "[4] HIO";
		Oxacidos [5] = "[5] HIO2";
		Oxacidos [6] = "[6] HIO3";
		Oxacidos [7] = "[7] HIO4"; 
		for(int i = 0;i<8;i++) {
			System.out.println(Oxacidos[i]);
		}
		
		
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		if (Eleccion == 0) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");
			
			System.out.println("Es un Acido HIPOCLOROSO");		
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido  CLOROSO");
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido CLORICO");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido PERCLORICO");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Hipoyodoso");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Yodoso");
		}else if (Eleccion == 6) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Yodico");
		}else if (Eleccion == 7) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Acido Peryodico");
		}
	}
}
	
	
	public static void main(String [] args) {
		
	}
}
