package Tema4.ejercicio9;

import java.util.Scanner;

public class Menus9 {
    public static void main(String[] args) {
        GestionProgramas gp = new GestionProgramas();
        Scanner sc = new Scanner(System.in);
        boolean salir=false;
        int num;


        do {
            Menu();
            System.out.println("ELIGE UNA OPCION");
            num = sc.nextInt();

            switch(num){
                case 1:
                    System.out.println("Dime el nombre del programa");
                    sc.nextLine();
                    String nombre1 = sc.nextLine();
                    System.out.println("Dime la version del programa");
                    String version = sc.nextLine();
                    System.out.println("Dime la funcion del programa");
                    String funcion = sc.nextLine();
                    System.out.println("Dime el año de creacion del programa");
                    int anoCreacion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Dime la empresa del programa");
                    String empresa = sc.nextLine();
                    System.out.println("Dime la licencia del programa");
                    String licencia = sc.nextLine();
                    System.out.println("Dime el precio del programa");
                    double precio = sc.nextDouble();
                    sc.nextLine();
                    Programa miProg = new Programa(nombre1, version, funcion, anoCreacion,
                            empresa, licencia, precio);
                    gp.InsertarPrograma(miProg);
                    break;

                case 2:
                    System.out.println("Mostrar lista de softwares");
                    gp.ListaSoftwares();
                    break;

                case 3:
                    System.out.println("Filtrar por licencia");
                    String l = sc.next();
                    gp.FiltrarLicencia(l);
                    break;
                case 4:
                    System.out.println("Filtrar por funcion");
                    String f = sc.next();
                    gp.Ffuncion(f);
                    break;
                case 5:
                    System.out.println("Eliminar ultimo elemento");
                    gp.Eliminar();
                    break;
                case 6:
                    System.out.println("Inserte el nombre de un programa");
                    String p = sc.next();
                    Programa pro = gp.Buscarprograma(p);
                    if(pro == null){
                        System.out.println("No se encontro programa con ese nombre");
                    }else{
                        System.out.println(pro);
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!salir);

    }
        private static void Menu () {
            System.out.println("""
                        1. Insertar nuevo programa (controlar elementos libres)
                        2. Mostrar lista de software
                        3. Filtrar por licencia
                        4. Filtrar por función
                        5. Eliminar el último elemento
                        6. Buscar programa por nombre y retornar programa
                        7. Salir
                    """);
        }
    }

