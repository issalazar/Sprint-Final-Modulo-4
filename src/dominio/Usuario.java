package dominio;
import logica.IAsesoria;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Usuario implements IAsesoria {
	String nombre;
	String fecha;
	String rut;
	

	public Usuario(String nombre, String fecha, String rut) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.rut = rut;
	}
	
	public String mostrarEdad() {
		
		String[] fechaDividida = fecha.split("/");
		int d = Integer.parseInt(fechaDividida[0]);
		int m = Integer.parseInt(fechaDividida[1]);
		int a = Integer.parseInt(fechaDividida[2]);
		
		LocalDate fechaNacimiento = LocalDate.of(a, m, d);
		LocalDate fechaActual = LocalDate.now();
		String edad = String.valueOf(fechaNacimiento.until(fechaActual, ChronoUnit.YEARS));
		return "Edad: "+ edad +" años." + "\n";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public abstract String analizarUsuario();

}
