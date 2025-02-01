package Tema4.Ejercicio15.Ejercicio15.src.principal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		GestionCiudades g = new GestionCiudades();
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Buscar ciudadpor ID");
			System.out.println("2. Buscar ciudad mas poblada");
			System.out.println("3. Filtrar ciudades de un pais");
			System.out.println("4. Comparar dos ciudades");
			System.out.println("5. Mostrar varias ciudades por sus ids");
			System.out.println("6. Mostrar empleados nacidos en un año y mes");
			System.out.println("7. Salir");
			System.out.print("Elige una opción: ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num) {
				case 1:
					System.out.println("Introduce un id");
					String ciud = sc.nextLine();
					Ciudad ciu1 = g.buscarCiudadPorId(ciud);
					if (ciud != null) {
						g.buscarCiudadPorId(ciud);
					} else {
						System.out.println("error de id");
					}
					break;
				case 2:
					System.out.println(" la ciudad mas poblada es ");
					Ciudad ciudadMasPoblada = g.buscarCiudadMasPoblada();
					g.buscarCiudadMasPoblada();
					break;

				case 3:
					System.out.println("introduce un pais");
					String pa = sc.nextLine();
					System.out.println("Estas son las diudades del pais : ");
					g.mostrarCiudadesDelPais(pa);
					break;
				case 4:
					System.out.println("Introduce la primera ciudad");
					String c1 = sc.nextLine();
					System.out.println("Introduce la segunda ciudad");
					String c2 = sc.nextLine();

					Ciudad ciudad1 = g.buscarCiudadPorId(c1);
					Ciudad ciudad2 = g.buscarCiudadPorId(c2);

					if (ciudad1 != null && ciudad2 != null) {

						if (g.comparaCiudades(ciudad1, ciudad2)) {
							System.out.println("Las ciudades son iguales.");
						} else {
							System.out.println("Las ciudades no son iguales.");
						}
					} else {
						System.out.println("Una o ambas ciudades no se encontraron.");
					}
					break;
				case 5:
					System.out.println("Introduce varios ids separados por espacio:");
					String ids = sc.nextLine();

					String[] idsArray = ids.split(" ");  // Separar los ids por espacio
					ArrayList<String> listaIds = new ArrayList<>();  // Lista de ids
					for (String id : idsArray) {
						listaIds.add(id);
					}
					g.mostrarVariasCiudades(listaIds);  // Mostrar las ciudades con los ides proporcionados
					break;
				case 6:
					System.out.println("Introduce varios coddigos de paises");
					String cp = sc.next();

					String[] añadir = cp.split(" ");
					ArrayList<String> listaCP = new ArrayList<>();
					for (String c : añadir) {
						listaCP.add(c);
					}
					g.mostrarCiudadesPaises(listaCP);
					break;
				case 7:
					System.out.println("HAs elegido salir");
					break;
			}


		} while (num != 7);

	}
}
