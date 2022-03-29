/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad.ejneodatiscuentas.pojos;

import java.util.List;
import java.util.Set;

/**
 *
 * @author a20armandocb
 */
public class CuentaCorriente extends Cuenta {

    private List movimientos;

    public CuentaCorriente() {

    }

    public CuentaCorriente(List movimientos, int numero, String sucursal, float saldoActual, Set<Cliente> clientes) {
        super(numero, sucursal, saldoActual, clientes);
        this.movimientos = movimientos;
    }

    public List getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List movimientos) {
        this.movimientos = movimientos;
    }

    public boolean addMovimientos(Movimiento movimiento) {
        if (!movimientos.contains(movimiento)) {
            this.movimientos.add(movimiento);
            return true;
        }
        return false;
    }

}
