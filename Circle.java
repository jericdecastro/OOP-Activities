class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14159 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14159 * radius;
    }

    @Override
    public String toString() {
        return "Circle: Radius: " + radius + ", " + super.toString();
    }
}

