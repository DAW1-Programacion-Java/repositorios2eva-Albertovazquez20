package Tema5.Ejercicio3.src.clases;

import java.time.LocalDate;

public class GestionAlquileres {
	private VehiculoAlquilado [] alquiladosT = new VehiculoAlquilado[7];

	public GestionAlquileres() {
		alquiladosT[0] = new VehiculoAlquilado(new Cliente(1, "Ana" ,"Robles Paz"),
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 5);
		alquiladosT[1] = new VehiculoAlquilado(new Cliente(2, "Luis" ,"Santo Paz"),
				new Vehiculo("1111-BMC", "Renault", "Clio",25, true),
				LocalDate.now(), 1);
		alquiladosT[2] = new VehiculoAlquilado(new Cliente(3, "Gema" ,"D�az Paz"),
				new Vehiculo("1233-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 9);
		alquiladosT[3] = new VehiculoAlquilado(new Cliente(4, "Tom�s" ,"Sanz Eno"),
				new Vehiculo("1290-BMC", "Volvo", "XC90", 120, true),
				LocalDate.now(), 11);
		alquiladosT[4] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("9090-BMC", "Volkswagen", "Golf", 34, true),
				LocalDate.now(), 10);
		alquiladosT[5] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("9091-BMC", "Volkswagen", "Passat", 54, true),
				LocalDate.of(2021, 1, 14), 10);
		alquiladosT[6] = new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.of(2021, 01, 1), 10);
	}

	//Dado un número de matrícula, debe buscar en el array alquilados y devolver el Cliente que alquiló ese coche.
	public Cliente getClienteAlquiler(String matricula) {
		for (VehiculoAlquilado v : alquiladosT){
			if (v.getVehiculo().getMatricula().equalsIgnoreCase(matricula)){
				return v.getCliente();
			}

		}return null;
	}

	//Dado un ID de cliente, contar cuántos alquileres tiene registrados en alquilados.
	public int contarAlquileresCliente(int idCliente) {
		int contador = 0;
		for (VehiculoAlquilado v : alquiladosT){
			if (v.getCliente().getId() == idCliente){
				contador++;
			}
		}return contador;
	}


	//Debe calcular el importe total de todos los alquileres registrados en alquilados.
	public double sumaImporteTodosAlquileres() {
		int total = 0;
		for (VehiculoAlquilado v : alquiladosT){
			total += total + v.getNumeroDias();
		}
		return total;
	}
	
	//Debe mostrar por pantalla todos los alquileres de un coche con una matrícula específica.

	public void mostrarAlquileresMatricula(String matricula) {
		for (VehiculoAlquilado v : alquiladosT){
			if (v.getVehiculo().getMatricula().equalsIgnoreCase(matricula)){
				System.out.println(v);
			}
		}
	}
	
}
