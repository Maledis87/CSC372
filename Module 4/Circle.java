public class Circle extends Shape {
    private double radius;

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Compute area
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Compute perimeter
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle [radius=" + radius +
                ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
