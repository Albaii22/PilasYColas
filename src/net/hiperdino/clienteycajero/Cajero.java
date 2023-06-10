package net.hiperdino.clienteycajero;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String nombre;
    private String id;
    private int salario;
    private int idCaja;
    private Queue<Cliente> filaClientes;

    public Cajero(String nombre) {
        this.nombre = nombre;
        this.filaClientes = new LinkedList<>();
    }

    public Queue<Cliente> getFilaClientes() {
        return filaClientes;
    }

    public void agregarCliente(Cliente cliente) {
        filaClientes.add(cliente);
    }

    public Cliente atenderCliente() {
        return filaClientes.poll();
    }

    public int longitudFilaClientes() {
        return filaClientes.size();
    }

    @Override
    public String toString() {
        String listaClientes = "";
        for (Cliente cliente : filaClientes) {
            listaClientes += this.nombre + "\n";
        }
        return "Cajero\n" +
                "===================================\n" +
                "* Número de caja: " + idCaja + "\n" +
                "* Total de clientes: " + +filaClientes.size() + "\n" +
                "* Cliente en la fila:\n" + listaClientes +
                "===================================\n";
    }

    public void abrirCaja() {
        System.out.println("Se ha abiero la caja");
    }

    public void cerrarCaja() {
        System.out.println("Se ha cerrado la caja");
    }

    public boolean hayClientesEnCola() {
        return hayClientesEnCola();
    }

    public int getNumeroCaja() {
        return idCaja;
    }


}
