package Interface;

public class Circulo implements FiguraGeometrica {
    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

