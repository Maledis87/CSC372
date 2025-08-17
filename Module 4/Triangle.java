public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Parameterized constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Compute area using Heron's formula
    @Override
    public double area() {
        double s = perimeter() / 2;  // semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Compute perimeter
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // toString
    @Override
    public String toString() {
        return "Triangle [sides=" + side1 + ", " + side2 + ", " + side3 +
                ", area=" + area() + ", perimeter=" + perimeter() + "]";
    }
}
