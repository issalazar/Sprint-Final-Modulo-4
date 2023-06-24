package dominio;

public class Capacitacion {
	
	String identificador;
	String cliente;
	String dia;
	String hora;
	String lugar;
	String duracion;
	int asistentes;
	
	public Capacitacion(String identificador, String cliente, String dia, String hora, String lugar, String duracion,
			int asistentes) {
		super();
		this.identificador = identificador;
		this.cliente = cliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.asistentes = asistentes;
	}

	public String mostrarDetalle() {
		
		return "La capacitación será en " + lugar + " a las " + hora + " del día " + dia + ", y durará " + duracion + " minutos.";
		
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String rut) {
		this.cliente = rut;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}

	

}
