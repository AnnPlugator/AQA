package lesson_6.ex_2;

/*
Применяя интерфейс написать программу расчёта периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик [Периметр, площадь, цвет фона, цвет границ] по каждой фигуре вывести в консоль.
Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
 */
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2, "Red", "Black");
        Shape rectangle = new Rectangle(1, 3, "Blue", "Green");
        Shape triangle = new Triangle(2, 3, 4, "Yellow", "Purple");

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);
    }

    private static void printShapeDetails(Shape shape) {
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Fill Color: " + shape.getFillColor());
        System.out.println("Border Color: " + shape.getBorderColor());
        System.out.println();
    }
}