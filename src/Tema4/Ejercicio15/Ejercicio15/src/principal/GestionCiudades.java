package Tema4.Ejercicio15.Ejercicio15.src.principal;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionCiudades {

	private Ciudad [] ciudades;
	
	public GestionCiudades() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("ciudades.csv"), 
					StandardCharsets.UTF_8);
			ciudades = new Ciudad[lines.size()];
			int i=0;
			for (String string : lines) {
				ciudades[i] = new Ciudad(string);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mostrar() {
		for (Ciudad ciudad : ciudades) {
			System.out.println(ciudad.toString());
		}
	}

		public Ciudad buscarCiudadPorId(String ide){
		for (Ciudad c : ciudades){
			if(c.getId().equalsIgnoreCase(ide)){
				return c;
			}
		}return null;
	}
	public Ciudad buscarCiudadMasPoblada(){
		Ciudad ciudadMas =  ciudades[0];
		for (Ciudad c : ciudades){
			if(ciudadMas.getPoblacion() < c.getPoblacion()){
				ciudadMas = c;
			}
		}
		return ciudadMas;
	}

	public void mostrarCiudadesDelPais(String pais){
		for (Ciudad c : ciudades){
			if(c.getPais().equalsIgnoreCase(pais)){
				System.out.println(c);
			}
		}
	}
	/* OTRA OPCION DE SI NO ENCUENTRA CIUDAD CON ESE NOMBRE SALGA ERROR

	public void mostrarCiudadesDelPais(String pais) {
		boolean encontrado = false;
		for (Ciudad c : ciudades) {
			if (c.getPais().equalsIgnoreCase(pais)) {
				System.out.println(c);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("No se encontraron ciudades en el país: " + pais);
		}
	}*/

	public static boolean comparaCiudades(Ciudad c1, Ciudad c2){
		if(c1.getId().equalsIgnoreCase(c2.getId()) && c1.getNombre().equalsIgnoreCase(c2.getNombre())){
			return true;
		}else{
			return false;
		}

	}
	public void mostrarVariasCiudades(ArrayList<String> ide){
		for (Ciudad c : ciudades){
			if (ide.contains(c.getId())){
				System.out.println(c);
			}
		}
	}
	public void mostrarCiudadesPaises(ArrayList<String> codigoPais){
		for (Ciudad c : ciudades){
			if (codigoPais.contains(c.getCodigoPais())){
				System.out.println(c);
			}
		}
	}
}
