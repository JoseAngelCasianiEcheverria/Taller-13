/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package OBJ;

/**
 *
 * @author Gercray
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        double precioOriginal = 100.0;
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(10);
        Descuento descuentoFijo = new DescuentoFijo(15);
        
        System.out.println("Precio con descuento porcentual: " + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.aplicarDescuento(precioOriginal));
    }
}
