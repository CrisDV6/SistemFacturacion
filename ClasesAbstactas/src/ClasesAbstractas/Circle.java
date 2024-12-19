package ClasesAbstractas;

public class Circle extends FiguraGeométrica {
    private double radio;

    // Constructor
    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Círculo - " + super.toString();
    }
}
