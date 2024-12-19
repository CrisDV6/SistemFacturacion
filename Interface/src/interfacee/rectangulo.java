package interfacee;

public class rectangulo implements figuraGeometrica {
    private double base;
    private double altura;

    // Constructor
    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
