package modelos;

public abstract class MPersona {

    private String nombresPersona;
    private String apellidosPersona;
    private int telefonoPersona;
    private String correoPersona;
    private String fechaNacimientoPersona;
    private String direccionPersona;
    private char sexoPersona;
    private String paisPersona;
    private String identificacionPersona;


    public MPersona() {




    }

    public String getnombresPersona() {
        return nombresPersona;
    }

    public void setNombresPersona(String nombresPersona) {
        this.nombresPersona = nombresPersona;
    }

    public String getapellidosPersona() {
        return apellidosPersona;
    }

    public void setApellidosPersona(String apellidosPersona) {
        this.apellidosPersona = apellidosPersona;
    }

    public int gettelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(int telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getcorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getfechaNacimientoPersona() {
        return fechaNacimientoPersona;
    }

    public void setFechaNacimientoPersona(String fechaNacimientoPersona) {
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }

    public String getdireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public char getsexoPersona() {
        return sexoPersona;
    }

    public void setSexoPersona(char sexoPersona) {
        this.sexoPersona = sexoPersona;
    }

    public String getpaisPersona() {
        return paisPersona;
    }

    public void setPaisPersona(String paisPersona) {
        this.paisPersona = paisPersona;
    }

    public String getIdentificacionPersona() {
        return paisPersona;
    }

    public void setIdentificacionPersona(String identificacionPersona) {
        this.identificacionPersona = identificacionPersona;
    }
}
