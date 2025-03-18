package modelos;

public class MMovimientos {

    private int numeroCuenta;
    private double ingresos;
    private double egresos;

    public int getnumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getingresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getegresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public void mostrarMovimientos() {

        System.out.println(
                " | Cuenta: " + this.getnumeroCuenta() +
                        " | Ingreso: " + this.getingresos() +
                        " | Egreso: " + this.getegresos()

        );


    }


}
