/*
* Triangle Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-29
*/

// Imports
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Triangle Class.
 */
public class Triangle {
    /**
     * The side1 field.
     */
    private int side1;

    /**
     * The side2 field.
     */
    private int side2;

    /**
     * The side3 field.
     */
    private int side3;

    /**
     * Constructor.
     *
     * @param side1 - first side.
     * @param side2 - second side.
     * @param side3 - third side.
     */
    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * The getSide1() method.
     *
     * @return side1 - number.
     */
    public int getSide1() {
        return this.side1;
    }

    /**
     * The getSide2() method.
     *
     * @return side2 - number.
     */
    public int getSide2() {
        return this.side2;
    }

    /**
     * The getSide3() method.
     *
     * @return side3 - number.
     */
    public int getSide3() {
        return this.side3;
    }

    /**
     * The getSides() method.
     *
     * @return sides - array.
     */
    public ArrayList<Integer> getSides() {
        final ArrayList<Integer> sides = new ArrayList<Integer>();
        sides.add(this.side1);
        sides.add(this.side2);
        sides.add(this.side3);
        return sides;
    }

    /**
     * The isTriangleValid() method.
     *
     * <p>
     * Determines if the triangle is valid.
     * </p>
     *
     * @return valid - boolean.
     */
    protected boolean isTriangleValid() {
        boolean valid = false;
        final int[] sides = {this.side1, this.side2, this.side3};
        int min = sides[0];

        for (int count = 1; count < sides.length; count++) {
            min = Math.min(min, sides[count]);
        }

        // Checks if any of the sides are not negative.
        if (!(min < 0)) {
            Arrays.sort(sides);
            valid = sides[0] + sides[1] > sides[2];
        }

        return valid;
    }

    /**
     * The getAngles() method.
     *
     * <p>
     * Returns an array of the 3 angles.
     * </p>
     *
     * @return degreeAngles - 3 angles.
     */
    public ArrayList<Integer> getAngles() {
        final ArrayList<Integer> degreeAngles = new ArrayList<Integer>();
        if (this.isTriangleValid()) {
            final double[] radianAngles = {
                Math.acos((Math.pow(this.side1, 2) + Math.pow(this.side2, 2)
                - Math.pow(this.side3, 2)) / (2 * this.side1 * this.side2)),
                Math.acos((Math.pow(this.side2, 2) + Math.pow(this.side3, 2)
                - Math.pow(this.side1, 2)) / (2 * this.side2 * this.side3)),
                Math.acos((Math.pow(this.side3, 2) + Math.pow(this.side1, 2)
                - Math.pow(this.side2, 2)) / (2 * this.side3 * this.side1)),
            };

            for (int count = 0; count < radianAngles.length; count++) {
                final int sumAngles = 180;
                degreeAngles.add(
                    (int) Math.round(radianAngles[count] * (sumAngles / Math.PI)));
            }
        } else {
            degreeAngles.add(-1);
        }

        return degreeAngles;
    }

    /**
     * The getArea() method.
     *
     * <p>
     * Returns the area of the triangle.
     * </p>
     *
     * @return area - number.
     */
    public double getArea() {
        final double area;
        if (this.isTriangleValid()) {
            // The semi-perimeter
            final double sp = (this.side1 + this.side2 + this.side3) / 2;
            area = Math.sqrt(
                sp * ((sp - this.side1) * (sp - this.side2) * (sp - this.side3))
            );
        } else {
            area = -1;
        }

        return area;
    }

    /**
     * The getName() method.
     *
     * <p>
     * Returns a name for the triangle.
     * </p>
     *
     * @return name - string
     */
    public String getName() {
        final String name;
        if (this.isTriangleValid()) {
            if (
                this.side1 == this.side2
                    && this.side2 == this.side3
            ) {
                name = "Equilateral";
            } else if (this.side1 == this.side2 && this.side1 != this.side3
                    || this.side2 == this.side3 && this.side2 != this.side3
            ) {
                name = "Isosceles";
            } else {
                final ArrayList<Integer> angles = this.getAngles();
                boolean rightAngle = false;
                final int rightAngleDegree = 90;

                // Checks if one of the angles is 90.
                for (int count = 0; count < angles.size(); count++) {
                    if (angles.get(count) == rightAngleDegree) {
                        rightAngle = true;
                        break;
                    }
                }

                if (rightAngle) {
                    name = "Right Angle";
                } else {
                    name = "Scalene";
                }
            }
        } else {
            name = "-1";
        }

        return name;
    }

    /**
     * The getPerimeter method.
     *
     * <p>
     * Returns the sum of all 3 sides.
     * </p>
     *
     * @return perimeter - number.
     */
    public int getPerimeter() {
        final int perimeter;
        if (this.isTriangleValid()) {
            perimeter = this.side1 + this.side2 + this.side3;
        } else {
            perimeter = -1;
        }
        return perimeter;
    }
}
