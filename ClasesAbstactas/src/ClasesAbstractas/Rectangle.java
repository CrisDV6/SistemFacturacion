package ClasesAbstractas;

public class Rectangle extends FiguraGeométrica {
    private double base;
    private double altura;

    // Constructor
    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo - " + super.toString();
    }
}
