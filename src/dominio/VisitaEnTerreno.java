package dominio;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class VisitaEnTerreno {
    private int identificadorVisita;
    private String rutCliente;
    private Date dia;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaEnTerreno() {
    }

    public VisitaEnTerreno(int identificadorVisita, String rutCliente, String dia, String hora,
                           String lugar, String comentarios) throws ParseException {
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dia = dateFormat.parse(dia);
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}