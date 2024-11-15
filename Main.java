public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        Square square = new Square(3.0, "Green", true);

        System.out.println(circle.toString() + ", Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        System.out.println(rectangle.toString() + ", Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());
        System.out.println(square.toString() + ", Area: " + square.getArea() + ", Perimeter: " + square.getPerimeter());
    }
}