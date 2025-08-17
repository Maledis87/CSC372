public class Rectangle extends Shape {
    private double width;
    private double length;

    // Parameterized constructor
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Compute area
    @Override
    public double area() {
        return width * length;
    }

    // Compute perimeter
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    // toString
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length +
                ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
