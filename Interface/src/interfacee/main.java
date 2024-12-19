package interfacee;

public class main {
    public static void main(String[] args) {
        figuraGeometrica rectangulo = new rectangulo(3, 9);
        figuraGeometrica triangulo = new triangulo(2, 7);
        figuraGeometrica circulo = new circulo(10);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }
}