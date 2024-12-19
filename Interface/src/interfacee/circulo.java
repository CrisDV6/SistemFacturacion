package interfacee;

public class circulo implements figuraGeometrica {
    private double radio;

    // Constructor
    public circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
