package points;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point: " + p1); // Output: (2.5,3.5)

        p1.setXY(5.0f, 7.0f);
        System.out.println("Updated Point: " + p1); // Output: (5.0,7.0)

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(1.0f, 1.5f, 0.5f, 0.7f);
        System.out.println("MovablePoint: " + mp1); // Output: (1.0,1.5), speed=(0.5,0.7)

        mp1.move();
        System.out.println("After Move: " + mp1); // Output: (1.5,2.2), speed=(0.5,0.7)

        mp1.setSpeed(2.0f, 3.0f);
        mp1.move();
        System.out.println("After Changing Speed and Moving: " + mp1); // Output: (3.5,5.2), speed=(2.0,3.0)
    }
}
