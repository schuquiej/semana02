package modelos;

public class MCliente extends MPersona {

    private int numeroCuenta;


    public MCliente() {

        super();

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public void mostrarCliente() {

        System.out.println(
                " | Nombre: " + this.getnombresPersona() +
                        " | Apellidos: " + this.getapellidosPersona() +
                        " | Telefono: " + this.gettelefonoPersona() +
                        " | Correo: " + this.getcorreoPersona() +
                        " | Fecha Nacimiento: " + this.getfechaNacimientoPersona() +
                        " | Direccion: " + this.getdireccionPersona() +
                        " | Sexo: " + this.getsexoPersona() +
                        " | Pais: " + this.getpaisPersona() +
                        " | Numero de cuenta: " + this.getNumeroCuenta()

        );


    }
}
