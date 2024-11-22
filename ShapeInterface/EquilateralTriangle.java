package ShapeInterface;

public class EquilateralTriangle extends Triangle {
    // Constructor
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.name = "Equilateral Triangle"; // Override name
    }
}
