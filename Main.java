/*
* This is the standard Main() class starting point.
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-29
*/

/**
 * Main class.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        System.out.println();

        final Triangle testTriangle1 = new Triangle(3, 4, 5);
        System.out.println("Created a 3 mm by 4 mm by 5 mm triangle.");
        System.out.println(" → Is the triangle valid: " + String.valueOf(testTriangle1.isValid()));
        System.out.println(" → Semiperimeter: " + String.format("%.4f mm", testTriangle1.semiPerimeter()));
        System.out.println(" → Area: " + String.format("%.4f mm²", testTriangle1.area()));
        System.out.println(" → Type: " + testTriangle1.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f rad", testTriangle1.angle(1)));
        System.out.println(" → Angle 2: " + String.format("%.4f rad", testTriangle1.angle(2)));
        System.out.println(" → Angle 3: " + String.format("%.4f rad", testTriangle1.angle(3)));

        System.out.println();
        
        final Triangle testTriangle2 = new Triangle(3, 3, 3);
        System.out.println("Created a 3 mm by 3 mm by 3 mm triangle.");
        System.out.println(" → Is the triangle valid: " + String.valueOf(testTriangle2.isValid()));
        System.out.println(" → Semiperimeter: " + String.format("%.4f mm", testTriangle2.semiPerimeter()));
        System.out.println(" → Area: " + String.format("%.4f mm²", testTriangle2.area()));
        System.out.println(" → Type: " + testTriangle2.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f rad", testTriangle2.angle(1)));
        System.out.println(" → Angle 2: " + String.format("%.4f rad", testTriangle2.angle(2)));
        System.out.println(" → Angle 3: " + String.format("%.4f rad", testTriangle2.angle(3)));

        System.out.println();
        
        final Triangle testTriangle3 = new Triangle(3, 4, 4);
        System.out.println("Created a 3 mm by 4 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + String.valueOf(testTriangle3.isValid()));
        System.out.println(" → Semiperimeter: " + String.format("%.4f mm", testTriangle3.semiPerimeter()));
        System.out.println(" → Area: " + String.format("%.4f mm²", testTriangle3.area()));
        System.out.println(" → Type: " + testTriangle3.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f rad", testTriangle3.angle(1)));
        System.out.println(" → Angle 2: " + String.format("%.4f rad", testTriangle3.angle(2)));
        System.out.println(" → Angle 3: " + String.format("%.4f rad", testTriangle3.angle(3)));

        System.out.println();
        
        final Triangle testTriangle4 = new Triangle(2, 3, 4);
        System.out.println("Created a 2 mm by 3 mm by 4 mm triangle.");
        System.out.println(" → Is the triangle valid: " + String.valueOf(testTriangle4.isValid()));
        System.out.println(" → Semiperimeter: " + String.format("%.4f mm", testTriangle4.semiPerimeter()));
        System.out.println(" → Area: " + String.format("%.4f mm²", testTriangle4.area()));
        System.out.println(" → Type: " + testTriangle4.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f rad", testTriangle4.angle(1)));
        System.out.println(" → Angle 2: " + String.format("%.4f rad", testTriangle4.angle(2)));
        System.out.println(" → Angle 3: " + String.format("%.4f rad", testTriangle4.angle(3)));

        System.out.println();

        final Triangle testTriangle5 = new Triangle(23, 4, 6);
        System.out.println("Created a 23 mm by 4 mm by 6 mm triangle.");
        System.out.println(" → Is the triangle valid: " + String.valueOf(testTriangle5.isValid()));
        System.out.println(" → Semiperimeter: " + String.format("%.4f mm", testTriangle5.semiPerimeter()));
        System.out.println(" → Area: " + String.format("%.4f mm²", testTriangle5.area()));
        System.out.println(" → Type: " + testTriangle5.getType());
        System.out.println(" → Angle 1: " + String.format("%.4f rad", testTriangle5.angle(1)));
        System.out.println(" → Angle 2: " + String.format("%.4f rad", testTriangle5.angle(2)));
        System.out.println(" → Angle 3: " + String.format("%.4f rad", testTriangle5.angle(3)));

        System.out.println("\nDone.");
    }
}
