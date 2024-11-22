package ShapeInterface;

public abstract class Shape implements Scalable {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for perimeter and area
    public abstract double computePerimeter();

    public abstract double computeArea();

    // toString method
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
