package shapes;

public class Ellipse extends Shape {
    private double a; //  axis1
    private double b; //  axis2

    // Constructor
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        // Assign larger value to 'a' and smaller to 'b'
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double computePerimeter() {
        // Perimeter formula
        return Math.PI * (2 * (a + b) - ((a - b) * (a - b)) / (2 * (a + b)));
    }

    @Override
    public double computeArea() {
        return Math.PI * a * b;
    }
}
