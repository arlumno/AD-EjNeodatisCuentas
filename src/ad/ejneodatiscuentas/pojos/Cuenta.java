/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.ejneodatiscuentas.pojos;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author a20armandocb
 */
public class Cuenta implements Serializable{

    private int numero;
    private String sucursal;
    private float saldoActual;
    private Set<Cliente> clientes;

    public Cuenta() {
    }

    public Cuenta(int numero, String sucursal, float saldoActual, Set<Cliente> clientes) {
        this.numero = numero;
        this.sucursal = sucursal;
        this.saldoActual = saldoActual;
        this.clientes = clientes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

}
