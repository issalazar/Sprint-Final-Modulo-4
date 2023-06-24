package dominio;

import logica.IAsesoria;

public class Cliente extends Usuario implements IAsesoria{

	
	public Cliente(String nombre, String fecha, String rut, String nombres, String apellido,
			String telefono, String afp, int sistemaDeSalud, String direccion, String comuna, int edad) {
		super(nombre, fecha, rut);
		this.nombres = nombres;
		this.apellido = apellido;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	String nombres;
	String apellido;
	String telefono;
	String afp;
	int sistemaDeSalud;
	String direccion;
	String comuna;
	int edad;
	
	public String obtenerNombre() {
		String data="";
		data= nombres+" "+apellido;
		return data;
	}
	public String obtenerSistemaDeSalud() {
		String data="";
		if(sistemaDeSalud==1) {
			data="fonasa";
		}
		else if(sistemaDeSalud==2) {
			data="isapre";
		}
		else{
			data="sistema de salud invalido";
		}
		return data;
	}
	public String analizarUsuario() {
		String data="";
		data= "Nombre: "+ obtenerNombre()+ " / Rut:  "+ getRut() +" / Dirección: "+ direccion +" / Comuna: "+ comuna;
		return data;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public int getSistemaDeSalud() {
		return sistemaDeSalud;
	}
	public void setSistemaDeSalud(int sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}

