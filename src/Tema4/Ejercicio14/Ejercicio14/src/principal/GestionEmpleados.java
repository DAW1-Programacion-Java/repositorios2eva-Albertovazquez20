package Tema4.Ejercicio14.Ejercicio14.src.principal;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GestionEmpleados {

	private Empleado [] empleados;

	public GestionEmpleados() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("C:/Users/Alumno_ciclo/IdeaProjects/2evaluacion/repositorios2eva-Albertovazquez20/src/Tema4/Ejercicio14/Ejercicio14/empleados.csv"), StandardCharsets.UTF_8);

			empleados = new Empleado[lines.size()];
			int i=0;
			for (String string : lines) {
				empleados[i] = new Empleado(string);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Empleado buscarEmpleadoPorId(String ide){
		for (Empleado e : empleados){
			if(e.getId().equalsIgnoreCase(ide)){
				return e;
			}
		}return null;
	}
	public void empleadosCorreo(String cadena){
		for (Empleado e : empleados){
			if(e.getCorreo().contains(cadena)){
				System.out.println(e);
			}
		}
	}

	public void filtrarPorSalario(BigDecimal salariomin, BigDecimal salariomax){
		for (Empleado e : empleados){
			BigDecimal salario = e.getSalario();
			if (salario.compareTo(salariomin) >=0 && salario.compareTo(salariomax) <=0){
				System.out.println("ID: " + e.getId());
				System.out.println("Nombre: " + e.getNombre());
				System.out.println("Apellidos: " + e.getApellido());
				System.out.println("Salario: " + salario);
				System.out.println("--------------");

			}
		}
	}
		public boolean actualizaSalario(String ide, BigDecimal nuevosalario){
		for (Empleado e : empleados){
			if(e.getId().equalsIgnoreCase(ide)){
				e.setSalario(nuevosalario);
				return true;
			}

		}
		return false;
	}
	public void nacidosEn(int anio){
		for (Empleado e : empleados){
			int year = e.getFechaNac().getYear();
			if (year == anio){
				System.out.println(e);
			}
		}
	}
    public void nacidosEn(int year, int month){
        for (Empleado e : empleados){
            int anio = e.getFechaNac().getYear();
            int mes = e.getFechaNac().getMonthValue();
            if (anio == year && month == mes){
                System.out.println(e);
            }
        }
    }
}
