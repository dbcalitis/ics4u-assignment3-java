/*
* Triangle Class
*
* @author  Daria Bernice Calitis
* @version 11.0.16
* @since   2022-10-29
*/

// Imports
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
     * The isValid() method.
     *
     * <p>
     * Determines if the triangle is valid.
     * </p>
     *
     * @return valid - boolean.
     */
    protected boolean isValid() {
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
     * The perimeter method.
     *
     * <p>
     * Returns the sum of all 3 sides.
     * </p>
     *
     * @return perimeter - number.
     */
    private int perimeter() {
        final int perimeter;
        if (this.isValid()) {
            perimeter = this.side1 + this.side2 + this.side3;
        } else {
            perimeter = -1;
        }
        return perimeter;
    }

    /**
     * The semiPerimeter method.
     *
     * <p>
     * Returns the half of the triangle's perimeter.
     * </p>
     *
     * @return semiPerimeter - number.
     */
    public float semiPerimeter() {
        final float semiPerimeter;
        if (this.isValid()) {
            // Converting perimeter into a float.
            final float perimeter = this.perimeter();
            semiPerimeter = perimeter / 2;
        } else {
            semiPerimeter = -1;
        }
        return semiPerimeter;
    }

    /**
     * The angle() method.
     *
     * <p>
     * Returns an array of the 3 angles.
     * </p>
     *
     * @param angleNumber - number of an angle.
     * @return degreeAngles - 3 angles.
     */
    public double angle(int angleNumber) {
        final double radianAngle;
        final int numAngles = 3;
        if (this.isValid() && angleNumber > 0 && angleNumber <= numAngles) {
            // I do not want to redo this, so I will not remove this array.
            final double[] radianAngles = {
                Math.acos((Math.pow(this.side1, 2) + Math.pow(this.side2, 2)
                - Math.pow(this.side3, 2)) / (2 * this.side1 * this.side2)),
                Math.acos((Math.pow(this.side2, 2) + Math.pow(this.side3, 2)
                - Math.pow(this.side1, 2)) / (2 * this.side2 * this.side3)),
                Math.acos((Math.pow(this.side3, 2) + Math.pow(this.side1, 2)
                - Math.pow(this.side2, 2)) / (2 * this.side3 * this.side1)),
            };

            radianAngle = radianAngles[angleNumber - 1];
        } else {
            radianAngle = -1;
        }

        return radianAngle;
    }

    /**
     * The area() method.
     *
     * <p>
     * Returns the area of the triangle.
     * </p>
     *
     * @return area - number.
     */
    public double area() {
        final double area;
        if (this.isValid()) {
            // The semi-perimeter
            final double sp = this.semiPerimeter();
            area = Math.sqrt(
                sp * ((sp - this.side1) * (sp - this.side2) * (sp - this.side3))
            );
        } else {
            area = -1;
        }

        return area;
    }

    /**
     * The getType() method.
     *
     * <p>
     * Returns a name for the triangle.
     * </p>
     *
     * @return name - string
     */
    public String getType() {
        final String name;
        if (this.isValid()) {
            if (
                this.side1 == this.side2
                    && this.side2 == this.side3
            ) {
                name = "Equilateral";
            } else if (this.side1 == this.side2 && this.side1 != this.side3
                    || this.side2 == this.side3 && this.side2 != this.side1
                    || this.side3 == this.side1 && this.side3 != this.side2
            ) {
                name = "Isosceles";
            } else {
                final double[] angles = {
                    this.angle(1),
                    this.angle(2),
                    this.angle(3),
                };
                boolean rightAngle = false;
                final int rightAngleDegree = 90;
                final int sumAngles = 180;

                // Checks if one of the angles is 90.
                for (int count = 0; count < angles.length; count++) {
                    if (angles[count] * (sumAngles / Math.PI)
                        == rightAngleDegree) {
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
}
