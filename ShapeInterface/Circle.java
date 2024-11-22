package ShapeInterface;

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Implement scale method
    @Override
    public void scale(double factor) {
        radius *= factor; // Scale the radius
    }
}
