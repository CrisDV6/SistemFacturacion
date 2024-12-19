package ClasesAbstractas;

public abstract class FiguraGeométrica {

    public abstract double calcularArea();

    // Método público para comparar áreas
    public boolean mayorQue(FiguraGeométrica otraFigura) {
        return this.calcularArea() > otraFigura.calcularArea();
    }

    @Override
    public String toString() {
        return "Área: " + calcularArea();
    }
}
