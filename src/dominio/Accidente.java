package dominio;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Accidente {
    private int identificadorAccidente;
    private String rutCliente;
    private Date dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int identificadorAccidente, String rutCliente, String dia, String hora,
                     String lugar, String origen, String consecuencias) throws ParseException {
        this.identificadorAccidente = identificadorAccidente;
        this.rutCliente = rutCliente;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dia = dateFormat.parse(dia);
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }

    public int getIdentificadorAccidente() {
        return identificadorAccidente;
    }

    public void setIdentificadorAccidente(int identificadorAccidente) {
        this.identificadorAccidente = identificadorAccidente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(String dia) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dia = dateFormat.parse(dia);
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }
}