package interfacee;

public class triangulo implements figuraGeometrica {
    private double base;
    private double altura;

    // Constructor
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}