
package Figuras;

public class Circulo extends Figuras{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Area del círculo: " + area);
    }
}
