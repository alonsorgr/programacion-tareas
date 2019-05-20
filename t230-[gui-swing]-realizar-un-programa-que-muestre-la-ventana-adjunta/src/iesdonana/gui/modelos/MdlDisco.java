package iesdonana.gui.modelos;

public class MdlDisco {
    private String etiqueta;
    private String capacidad;
    private String icono;

    public MdlDisco(String etiqueta, String capacidad, String icono) {
        setEtiqueta(etiqueta);
        setCapacidad(capacidad);
        setIcono(icono);
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getIcono() {
        return icono;
    }
}
