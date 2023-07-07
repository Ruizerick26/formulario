import java.io.Serializable;

public class objetotemporal implements Serializable {
    private String nombre;
    private String cedula;
    private String edad;

    public objetotemporal() {
    }

    public objetotemporal(String nombre, String cedula, String edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
