/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana02;

import clases.Cliente;
import modelos.MCliente;
import modelos.MMovimientos;

/**
 *
 * @author sergi
 */
public class Semana02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        MCliente datosCliente = new MCliente();
        Cliente cliente = new Cliente();


        datosCliente.setNumeroCuenta(10010);
        datosCliente.setApellidosPersona("chuquiej");
        datosCliente.setCorreoPersona("sergio@gmail.com");
        datosCliente.setDireccionPersona("guatemala magica");
        datosCliente.setIdentificacionPersona("10001000");
        datosCliente.setFechaNacimientoPersona("10/321/2020");
        datosCliente.setNombresPersona("sergio");
        datosCliente.setPaisPersona("guatemala");
        datosCliente.setSexoPersona('M');
        datosCliente.setTelefonoPersona(43432432);
        cliente.agregarCliente(datosCliente);


        datosCliente = new MCliente();
        datosCliente.setNumeroCuenta(11112121);
        datosCliente.setApellidosPersona("chuquiej2");
        datosCliente.setCorreoPersona("xxxxxxxxxx@gmail.com");
        datosCliente.setDireccionPersona("antigua magica");
        datosCliente.setIdentificacionPersona("10001000");
        datosCliente.setFechaNacimientoPersona("10/321/2020");
        datosCliente.setNombresPersona("serjio");
        datosCliente.setPaisPersona("guatemala");
        datosCliente.setSexoPersona('M');
        datosCliente.setTelefonoPersona(4444444);
        cliente.agregarCliente(datosCliente);




        cliente.listarCliente();
        cliente.listaMovimientos();

        // añadir movimiento

        MMovimientos movimientos = new MMovimientos();
        movimientos.setNumeroCuenta(10010);
        movimientos.setIngresos(100);
        movimientos.setEgresos(0);

        cliente.añadirMovimiento(movimientos);
        cliente.listaMovimientos();




    }
    
}
