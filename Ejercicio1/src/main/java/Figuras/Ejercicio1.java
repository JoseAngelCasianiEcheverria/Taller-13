
package Figuras;

public class Ejercicio1 {

    public static void main(String[] args) {
        Figuras[] figuras = { new Circulo(5), new Rectangulo(4, 6) };
        
        for (Figuras figura : figuras) {
            figura.calcularArea();
        }
    }
 }
