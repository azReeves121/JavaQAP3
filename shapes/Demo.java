package shapes;

public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];

        // Initialize shapes
        shapes[0] = new Circle(9.0); // Circle with radius 9
        shapes[1] = new Ellipse(8.0, 11.0); // Ellipse with axes 8 and 11
        shapes[2] = new Triangle(5.0, 7.0, 9.0); // Triangle with sides 5, 7, and 9
        shapes[3] = new EquilateralTriangle(6.0); // Equilateral Triangle with side 6

        // Display details of each shape
        for (Shape shape : shapes) {
            System.out.println(shape); // Uses overridden toString method
        }
    }
}
