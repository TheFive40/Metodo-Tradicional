package MetodoTradicional;

import java.util.Scanner;

public class OxidosTradicional {
	public void Oxidos() {
		System.out.println(" -------------------------------------------------- ");
		System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de Oxidos");
		System.out.println("¿Cual caso para los Oxidos desea aplicar?");
		Scanner entrada = new Scanner (System.in);
		int Caso = entrada.nextInt();
		if(Caso == 1) {
			System.out.println("✪ A continuacion la Lista de Oxidos Programados ✪");
			String [] Oxidos = new String [5];
			Oxidos[0] = "[0] K2O";
			Oxidos[1] = "[1] MgO";
			Oxidos[2] = "[2] Al2O3";
			Oxidos[3] = "[3] CaO";
			Oxidos[4] = "[4] Na2O";
			for(int i = 0;i<5;i++) {
				System.out.println(Oxidos[i]);
			}
			System.out.println(" ✪ Por favor, escoja  el número de la lista que desea ✪");
			Scanner Entrada = new Scanner(System.in);
			int Oxido = Entrada.nextInt();
			if(Oxido == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido de Potasio");
			}else if (Oxido == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido de Magnesio");
			}else if (Oxido == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido de Aluminio");
			}else if (Oxido == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido de Calcio");
			}else if (Oxido == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido de Sodio");
			}
		
		}else if (Caso == 2) {
			System.out.println("✪ A continuacion la Lista de Oxidos Programados ✪");
			String [] Oxidos = new String [6];
			Oxidos[0] = "[0] Fe2O2";
			Oxidos[1] = "[1] Fe3O2";
			Oxidos[2] = "[2] CuO";
			Oxidos[3] = "[3] PbO2";
			Oxidos[4] = "[4] Cu2O";
			Oxidos[5] = "[5] PbO";
			for(int i = 0;i<6;i++) {
				System.out.println(Oxidos[i]);
			}
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Oxido = Entrada.nextInt();
			if(Oxido == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Ferroso");
			}else if (Oxido == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Ferrico");
			}else if (Oxido == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Cuprico");
			}else if (Oxido == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Plúmbico");
			}else if (Oxido == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Cuproso");
			}else if (Oxido == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Plumboso");
			}
		}else if (Caso == 3) {
			System.out.println("A continuacion la Lista de Oxidos Programados");
			String [] Oxidos = new String [6];
			Oxidos[0] = "[0] SO";
			Oxidos[1] = "[1] SO2";
			Oxidos[2] = "[2] SO3";
			Oxidos[3] = "[3] TeO";
			Oxidos[4] = "[4] Teo2";
			Oxidos[5] = "[5] TeO3";
			for(int i = 0;i<6;i++) {
				System.out.println(Oxidos[i]);
			}
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Oxido = Entrada.nextInt();
			if(Oxido == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Hiposulfuroso");
			}else if (Oxido == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Sulfuroso");

			}else if (Oxido == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Sulfurico");
			}else if (Oxido == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Telurio");
			}else if (Oxido == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Teluroso");
			}else if (Oxido == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Telurico");
			}
			
		}else if (Caso == 4) {
			System.out.println("A continuacion la Lista de Oxidos Programados");
			String [] Oxidos = new String [8];
			Oxidos[0] = "[0] Cl2O";
			Oxidos[1] = "[1] Cl2O3";
			Oxidos[2] = "[2] Cl2O5";
			Oxidos[3] = "[3] Cl2O7";
			Oxidos[4] = "[4] I2O";
			Oxidos[5] = "[5] I2O5";
			Oxidos[6] = "[6] I2O3";
			Oxidos[7] = "[7] I2O7";
			for(int i = 0;i<8;i++) {
				System.out.println(Oxidos[i]);
			}
			System.out.println("Por favor, escoja  el número de la lista que desea");
			Scanner Entrada = new Scanner(System.in);
			int Oxido = Entrada.nextInt();
			if(Oxido == 0) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Hipocloroso");
			}else if (Oxido == 1) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Cloroso");
			}else if (Oxido == 2) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Clorico");
			}else if (Oxido == 3) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Perclorico");
			}else if (Oxido == 4) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Hipoyodoso");
			}else if (Oxido == 5) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Yodico");
			}else if (Oxido == 6) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Yodoso");
			}else if (Oxido == 7) {
				System.out.println("La nomenclatura del Elemento Seleccionado es:");

				System.out.println("Es un Oxido Peryodico");
			}
		}			

		
	}

	public static void main(String[] args) {
		OxidosTradicional Objeto = new OxidosTradicional();
		Objeto.Oxidos();
	}

}
