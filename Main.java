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
        final Triangle equiTriangle = new Triangle(10, 10, 10);

        System.out.println("Triangle 1:");
        System.out.println("Name: " + equiTriangle.getName());
        System.out.println("Perimeter: " + String.valueOf(equiTriangle.getPerimeter()));
        System.out.println("Area: " + String.valueOf(equiTriangle.getArea()));
        System.out.println("Sides: ");
        System.out.println(equiTriangle.getSides());
        System.out.println("Angles: ");
        System.out.println(equiTriangle.getAngles());

        System.out.println();
        
        final Triangle isoTriangle = new Triangle(15, 15, 5);

        System.out.println("Triangle 2:");
        System.out.println("Name: " + isoTriangle.getName());
        System.out.println("Perimeter: " + String.valueOf(isoTriangle.getPerimeter()));
        System.out.println("Area: " + String.valueOf(isoTriangle.getArea()));
        System.out.println("Sides: ");
        System.out.println(isoTriangle.getSides());
        System.out.println("Angles: ");
        System.out.println(isoTriangle.getAngles());

        System.out.println();
        
        final Triangle rightTriangle = new Triangle(3, 4, 5);

        System.out.println("Triangle 3:");
        System.out.println("Name: " + rightTriangle.getName());
        System.out.println("Perimeter: " + String.valueOf(rightTriangle.getPerimeter()));
        System.out.println("Area: " + String.valueOf(rightTriangle.getArea()));
        System.out.println("Sides: ");
        System.out.println(rightTriangle.getSides());
        System.out.println("Angles: ");
        System.out.println(rightTriangle.getAngles());

        System.out.println();
        
        final Triangle scaTriangle = new Triangle(10, 20, 15);

        System.out.println("Triangle 4:");
        System.out.println("Name: " + scaTriangle.getName());
        System.out.println("Perimeter: " + String.valueOf(scaTriangle.getPerimeter()));
        System.out.println("Area: " + String.valueOf(scaTriangle.getArea()));
        System.out.println("Sides: ");
        System.out.println(scaTriangle.getSides());
        System.out.println("Angles: ");
        System.out.println(scaTriangle.getAngles());

        System.out.println();
        
        final Triangle invalidTriangle = new Triangle(123, 10, 25);

        System.out.println("Triangle 5:");
        System.out.println("Name: " + invalidTriangle.getName());
        System.out.println("Perimeter: " + String.valueOf(invalidTriangle.getPerimeter()));
        System.out.println("Area: " + String.valueOf(invalidTriangle.getArea()));
        System.out.println("Sides: ");
        System.out.println(invalidTriangle.getSides());
        System.out.println("Angles: ");
        System.out.println(invalidTriangle.getAngles());

        System.out.println();
        
        final Triangle invalidTriangle2 = new Triangle(-1, 9, 5);

        System.out.println("Triangle 6:");
        System.out.println("Name: " + invalidTriangle2.getName());
        System.out.println("Perimeter: " + String.valueOf(invalidTriangle2.getPerimeter()));
        System.out.println("Area: " + String.valueOf(invalidTriangle2.getArea()));
        System.out.println("Sides: ");
        System.out.println(invalidTriangle2.getSides());
        System.out.println("Angles: ");
        System.out.println(invalidTriangle2.getAngles());

        System.out.println("\nDone.");
    }
}
