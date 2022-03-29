/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.ejneodatiscuentas.pojos;

import java.util.List;

/**
 *
 * @author a20armandocb
 */
public class Cliente {

    private String dni, nombre, direccion;
    private List<Cuenta> cuentas;

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String direccion, List<Cuenta> cuentas) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = cuentas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

}
