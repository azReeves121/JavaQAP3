package points;

public class Point {
    // Attributes
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}