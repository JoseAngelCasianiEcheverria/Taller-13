
package Figuras;

public class Rectangulo extends Figuras{
    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    void calcularArea() {
        double area = ancho * alto;
        System.out.println("Area del rectángulo: " + area);
    }
}
