package MetodoTradicional;

import java.util.Scanner;

public class HidrurosTradicional {
	public void Hidruros() {
		System.out.println(" -------------------------------------------------- ");
		System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de Hidruros");
		System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?");
		System.out.println("\n1: Caso 1 \n2: Caso 2");

		Scanner entrada = new Scanner (System.in);
		int Caso = entrada.nextInt();
		
		if(Caso == 1) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Hidruros = new String [5];
			Hidruros[0] = "[0] NaH";
			Hidruros[1] = "[1] KH";
			Hidruros[2] = "[2] MgH2";
			Hidruros[3] = "[3] AlH3";
			Hidruros[4] = "[4] CaH2";
			for(int i = 0;i<5;i++) {
				System.out.println(Hidruros[i]);
			}
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Eleccion = Entrada.nextInt();
			if (Eleccion == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");
				
				System.out.println("Es un Hidruro de Sodio");
				
			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro de Potasio");
			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro de Manganesio");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro de Aluminio");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro de Calcio");
			}
		}else if (Caso == 2) {
			System.out.println("A continuacion la Lista de Hidruros Programados");
			String [] Hidruros = new String [6];
			Hidruros [0] = "[0] Fe2H";
			Hidruros [1] = "[1] Fe3H";
			Hidruros [2] = "[2] CuH2";
			Hidruros [3] = "[3] PbH2";
			Hidruros [4] = "[4] CuH";
			Hidruros [5] = "[5] PbH4";
			
			for(int i = 0;i<5;i++) {
				System.out.println(Hidruros[i]);
			}
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Eleccion = Entrada.nextInt();
			if(Eleccion == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro Ferroso");
			}else if (Eleccion == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro Ferrico");
			}else if (Eleccion == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro Cuprico");
			}else if (Eleccion == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro Plumboso");
			}else if (Eleccion == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro Cuproso");
			}else if (Eleccion == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Hidruro Plombico");
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
