package shapes;

public class EquilateralTriangle extends Triangle {
    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side); // All sides are equal
        this.name = "Equilateral Triangle"; // Override name
    }
}
