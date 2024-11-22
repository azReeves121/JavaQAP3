package points;

public class MovablePoint extends Point {
    // Attributes
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructors
    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Initialize x and y using the parent constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Setters
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Move Method
    public MovablePoint move() {
        // Update the x and y using the parent class's setters
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this; // Return the current inst
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}

