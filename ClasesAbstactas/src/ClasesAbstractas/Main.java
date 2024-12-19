package ClasesAbstractas;

public class Main {
    public static void main(String[] args) {
        // Crea instancias de cada figura
        FiguraGeométrica rectangulo = new Rectangle(8, 4);
        FiguraGeométrica triangulo = new Triangle(3, 8);
        FiguraGeométrica circulo = new Circle(4);

        // Muestra las áreas de las figuras
        System.out.println(rectangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

        // Compara las áreas entre figuras
        System.out.println("¿El rectángulo es mayor que el triángulo? " + rectangulo.mayorQue(triangulo));
        System.out.println("¿El triángulo es mayor que el círculo? " + triangulo.mayorQue(circulo));
    }
}
