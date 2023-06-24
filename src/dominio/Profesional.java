package dominio;


import java.text.ParseException;

import logica.IAsesoria;

public class Profesional extends Usuario implements IAsesoria{
    private String titulo;
    private String fechaIngreso;


    public Profesional(String nombre, String fecha, String rut, String titulo, String fechaIngreso) {
		super(nombre, fecha, rut);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String setFechaIngreso(String fechaIngreso) throws ParseException {
        return fechaIngreso;
    }

    public String analizarUsuario() {
		String data="";
		data= ("Nombre: "+ nombre + " / Rut: "+ getRut() +" / Título: " + titulo+" / Fecha de ingreso: " + fechaIngreso);
		return data;
    }
}
