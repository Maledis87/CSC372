public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate objects
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(7);
        Shape square = new Rectangle(6, 6); // a square is a rectangle with equal sides

        // Store in array
        Shape[] shapeArray = {triangle, circle, square};

        // Loop and print using toString
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
