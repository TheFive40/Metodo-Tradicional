package MetodoTradicional;

import java.util.Scanner;

public class HidroxidosTradicional { //Nombre de la clase 
public void Hidroxidos() { //Metodo que contendra nuestras lineas de codigo y que sera ejecutado al instanciar la clase Hidroxidos
	System.out.println(" -------------------------------------------------- "); //Separador 
	System.out.println("Bienvenido, al Metodo Tradicional de Nomenclatura de Hidroxidos"); //Mnesaje de Bienvenida
	System.out.println("¿Cual Caso para los Hidroxidos desea aplicar?"); //Preguntamos que caso desea aplicar
	System.out.println("\n1: Caso 1 \n2: Caso 2");

	Scanner entrada = new Scanner (System.in); //Hacemos un Input es decir una entrada de datos
	int Caso = entrada.nextInt();  //Lo que ingreso por teclado lo guardamos en la variable Caso
	if(Caso == 1) { //Si lo que hay almacenado en la Variable caso es un 1
		
		//Enseñamos la lista de compuestos programadores almacenados en un Array o arreglo de 5 espacio de memoria de una dimension
		System.out.println("A continuacion la Lista de Hidroxidos Programados");
		String [] Hidroxidos = new String [5];
		Hidroxidos[0] = "[0] NaOH";
		Hidroxidos[1] = "[1] KOH";
		Hidroxidos[2] = "[2] MgOH";
		Hidroxidos[3] = "[3] AlOH";
		Hidroxidos[4] = "[4] CaOH";
		
		//Bucle for para recorrer dicho Arreglo 
		for(int i = 0;i<5;i++) {
			System.out.println(Hidroxidos[i]);
		}
		//Pedimos que escoja el numero de la lista que desea por teclado y nos lo guarde en la variable de tipo entero Eleccion
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		
		//Evaluamos con un condicional si escogio el compuesto que esta ubicado en la posicion 0 
		if(Eleccion == 0) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido de Sodio O Hidroxido Sodico"); //Si la condicion se cumple entonces imprime este mensaje en consola
			//si no se cumple pasa a evaluar la siguiente condicion 
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido de Potasio");

		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido de Magnesio");

		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido de Aluminio");

		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido de Calcio");

		}else {
			System.out.println("El compuesto ingresado no está programado aún");
		}
		System.out.println(" -------------------------------------------------- ");
	}else if (Caso == 2) { //Si escogio el caso 2 
		System.out.println("A continuacion la Lista de Hidroxidos Programados");
		String [] Hidroxidos = new String [6];
		Hidroxidos[0] = "[0] Fe2OH";
		Hidroxidos[1] = "[1] Fe3OH";
		Hidroxidos[2] = "[2] CuOH";
		Hidroxidos[3] = "[3] PbOH";
		Hidroxidos[4] = "[4] CuOH2";
		Hidroxidos[5] = "[5] PbH4";
		for(int i = 0;i<6;i++) {
			System.out.println(Hidroxidos[i]);
		}
		System.out.println("Por favor, escoja  el número de la lista que desea");
		Scanner Entrada = new Scanner(System.in);
		int Eleccion = Entrada.nextInt();
		if(Eleccion == 0) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido Ferroso");
		}else if (Eleccion == 1) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido Ferrico");
		}else if (Eleccion == 2) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido Cuproso");
		}else if (Eleccion == 3) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido Plumboso");
		}else if (Eleccion == 4) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido Cuprico");
		}else if (Eleccion == 5) {
			System.out.println("La nomenclatura del Elemento Seleccionado es:");

			System.out.println("Es un Hidroxido Plombico");
		}
	}
}
	public static void main(String[] args) {
		HidroxidosTradicional Objeto = new HidroxidosTradicional();
		Objeto.Hidroxidos();
	}

}
