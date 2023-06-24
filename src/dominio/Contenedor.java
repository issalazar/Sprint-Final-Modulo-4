package dominio;

import java.util.ArrayList;

public class Contenedor {
	private ArrayList<Usuario> lusuarios;
	private ArrayList<Capacitacion> lcapacitaciones;
	public Contenedor() {
		this.lusuarios = new ArrayList<Usuario>();
		this.lcapacitaciones = new ArrayList<Capacitacion>();
	}
	public ArrayList<Usuario> getLusuarios() {
		return lusuarios;
	}
	public void setLusuarios(ArrayList<Usuario> lusuarios) {
		this.lusuarios = lusuarios;
	}
	public ArrayList<Capacitacion> getLcapacitaciones() {
		return lcapacitaciones;
	}
	public void setLcapacitaciones(ArrayList<Capacitacion> lcapacitaciones) {
		this.lcapacitaciones = lcapacitaciones;
	}

}
