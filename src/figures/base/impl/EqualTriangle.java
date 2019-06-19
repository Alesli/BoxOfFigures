package figures.base.impl;


import static figures.Round.getRound;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

import figures.base.Figure;

import java.util.Objects;

/**
 * Class for getting the triangle
 * <p>
 * Created on 15.04.2019
 *
 * @author Alesia Slizhova
 */
public abstract class EqualTriangle extends Figure {

    private static final long serialVersionUID = 1L;

    private double side;

    /**
     * Constructor that creates a circle.
     *
     * @param side double
     */
    public EqualTriangle(double side) {
        this.side = side;
    }

    /**
     * Constructor that creates a triangle from any figure.
     *
     * @param figure, smaller side shape
     */
    public EqualTriangle(Figure figure) {
        this.side = figure.getMinSize() / 3;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    /**
     * The method which calculates a perimeter of triangle.
     *
     * @return double area
     */
    @Override
    public double getArea() {
        double area;
        area = sqrt(3) / 4 * pow(side, 2);
        return getRound(area);
    }


    /**
     * The method which calculates a square of triangle.
     *
     * @return double perimeter
     */
    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = 3 * side;
        return perimeter;
    }

    /**
     * The method returns a minimal side of the figure.
     *
     * @return double side
     */
    @Override
    public double getMinSize() {
        return side;
    }

    /**
     * toString override method
     *
     * @return String side, area, perimeter
     */
    @Override
    public String toString() {
        return "FilmEqualTriangle: " +
                "side = " + side + ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() + ", " + getColour();
    }

    /**
     * equals override method.
     *
     * @param object, input parameter to compare
     * @return comparison result
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        EqualTriangle equalTriangle = (EqualTriangle) object;
        return Double.compare(equalTriangle.side, side) == 0;
    }

    /**
     * Overrides the hash code method
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
