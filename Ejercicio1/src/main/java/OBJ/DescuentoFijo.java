/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OBJ;

/**
 *
 * @author Gercray
 */
public class DescuentoFijo extends Descuento{
    private double cantidad;

    public DescuentoFijo(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return Math.max(precio - cantidad, 0);
    }
}
