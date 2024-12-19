package ClasesAbstractas;

public class Triangle extends FiguraGeométrica {
    private double base;
    private double altura;

    // Constructor
    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triángulo - " + super.toString();
    }
}
