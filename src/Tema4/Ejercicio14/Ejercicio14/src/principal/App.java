package Tema4.Ejercicio14.Ejercicio14.src.principal;

import java.math.BigDecimal;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		GestionEmpleados ge = new GestionEmpleados();
		int num;
			Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Buscar empleado por ID");
			System.out.println("2. Buscar empleados por correo");
			System.out.println("3. Filtrar empleados por salario");
			System.out.println("4. Actualizar salario de un empleado");
			System.out.println("5. Mostrar empleados nacidos en un año");
			System.out.println("6. Mostrar empleados nacidos en un año y mes");
			System.out.println("7. Salir");
			System.out.print("Elige una opción: ");
			num = sc.nextInt();
			sc.nextLine();

			switch (num){
				case 1 :
					System.out.println("Introduce un ID de empleado");
					String ide = sc.nextLine();
					Empleado empleado = ge.buscarEmpleadoPorId(ide);
					if (empleado != null){
						System.out.println("Empleado encontrado: " + empleado);
					} else {
						System.out.println("Empleado no encontrado.");
					}
					break;
				case 2:
					System.out.println("INtroduce una cadena para el correo");
					String cadena = sc.nextLine();
					ge.empleadosCorreo(cadena);
					break;
				case 3:
					System.out.println("INtroduce un salario minimo");
					BigDecimal min = sc.nextBigDecimal();
					System.out.println("INtroduce un salario maximo");
					BigDecimal max = sc.nextBigDecimal();
					ge.filtrarPorSalario(min, max);
					break;
				case 4:
					System.out.println("Introduce el id del usuario para actualizar su salario");
					String id = sc.nextLine();
					System.out.println("INtroduce su nuevo salario");
					BigDecimal newsalario = sc.nextBigDecimal();

					if(ge.actualizaSalario(id, newsalario)){
						System.out.println("Salario actualizado correctamente");
					}else{
						System.out.println("Error de actualizar salario");
					}
					break;
				case 5:
					System.out.println("INtroduce un año");
					int anio = sc.nextInt();
					System.out.println("LOs nacidos en ese año son : ");
					ge.nacidosEn(anio);
					break;
				case 6:
					System.out.println("INtroduce un año");
					int ano = sc.nextInt();
					System.out.println("INtroduce un mes");
					int mes = sc.nextInt();
					System.out.println("LOs nacidos en ese año y mes son : ");
					ge.nacidosEn(ano, mes);
					break;
				case 7:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Opcion no valida");
					break;

			}
		}while(num != 7);
	
	}
}
