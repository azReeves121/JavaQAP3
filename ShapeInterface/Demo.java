package ShapeInterface;

public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(7.0);
        shapes[1] = new Ellipse(5.0, 9.0);
        shapes[2] = new Triangle(8.0, 4.0, 6.0);
        shapes[3] = new EquilateralTriangle(6.0);

        // Print shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes
        scaleAllShapes(shapes, 2.0); // Scale by a factor of 2

        // Print shapes after scaling
        System.out.println("\nShapes after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale all Scalable objects
    public static void scaleAllShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor); // Call scale method on each object
        }
    }
}
