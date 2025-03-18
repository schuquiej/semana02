package clases;

import modelos.MCliente;
import modelos.MMovimientos;

import java.util.ArrayList;

public class Cliente {
    boolean existe = false;

    Mensajes mensajes = new Mensajes();

    private ArrayList<MCliente> listaClientes;
    private ArrayList<MMovimientos> listaMovimientos;

    public Cliente() {
        this.listaClientes = new ArrayList<>();
        this.listaMovimientos = new ArrayList<>();
    }

    public void agregarCliente(MCliente c) {

        this.listaClientes.add(c);
        MMovimientos m = new MMovimientos();
        m.setNumeroCuenta(c.getNumeroCuenta());
        m.setIngresos(0);
        m.setEgresos(0);
        this.añadirCuenta(m);

        System.out.println("✅ Cliente agregado: " + c.getnombresPersona());

    }

    private void añadirCuenta(MMovimientos m) {


        for (MMovimientos cuenta : listaMovimientos) {
            if (cuenta.getnumeroCuenta() == m.getnumeroCuenta()) {
                existe = true;
                break;  // Si lo encontramos, salimos del bucle
            }
        }

        if(!existe) {
            listaMovimientos.add(m);
        }


    }


    public void añadirMovimiento(MMovimientos m) {


        for (MMovimientos cuenta : listaMovimientos) {
            if (cuenta.getnumeroCuenta() == m.getnumeroCuenta()) {

                mensajes.escribirMensaje("Se encontro la cuenta ","");
                cuenta.setIngresos(m.getingresos());
                cuenta.setEgresos(m.getegresos());

                break;  // Si lo encontramos, salimos del bucle
            }
        }





    }


    public void listarCliente() {
        mensajes.escribirMensaje("Listado de Clientes", "tipo de alerta");
        for (MCliente c : this.listaClientes) {
            c.mostrarCliente();

        }
    }

    public void listaMovimientos() {
        mensajes.escribirMensaje("Listado de cuentas/movimientos", "tipo de alerta");
        for (MMovimientos c : this.listaMovimientos) {
            c.mostrarMovimientos();

        }
    }



}
