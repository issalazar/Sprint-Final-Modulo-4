package dominio;

public class Revision {
    private int identificadorRevision;
    private int identificadorVisita;
    private String nombreAlusivo;
    private String detalleParaRevisar;
    private int estado;

    public Revision() {
    }

    public Revision(int identificadorRevision, int identificadorVisita, String nombreAlusivo,
                    String detalleParaRevisar, int estado) {
        this.identificadorRevision = identificadorRevision;
        this.identificadorVisita = identificadorVisita;
        this.nombreAlusivo = nombreAlusivo;
        this.detalleParaRevisar = detalleParaRevisar;
        this.estado = estado;
    }

    public int getIdentificadorRevision() {
        return identificadorRevision;
    }

    public void setIdentificadorRevision(int identificadorRevision) {
        this.identificadorRevision = identificadorRevision;
    }

    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificadorVisita(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    public String getNombreAlusivo() {
        return nombreAlusivo;
    }

    public void setNombreAlusivo(String nombreAlusivo) {
        this.nombreAlusivo = nombreAlusivo;
    }

    public String getDetalleParaRevisar() {
        return detalleParaRevisar;
    }

    public void setDetalleParaRevisar(String detalleParaRevisar) {
        this.detalleParaRevisar = detalleParaRevisar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}