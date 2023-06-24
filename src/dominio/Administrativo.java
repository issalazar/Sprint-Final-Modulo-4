package dominio;

import logica.IAsesoria;

public class Administrativo extends Usuario implements IAsesoria {
    private String area;
    private String experienciaPrevia;


    public Administrativo(String nombre, String fecha, String rut, String area, String experienciaPrevia) {
		super(nombre, fecha, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    public String analizarUsuario() {
		String data="";
		data= ("Nombre: "+ nombre + " / Rut: "+ getRut() +" / Área: " + area+ " / Experiencia previa: " + experienciaPrevia);

		return data;
    }
}