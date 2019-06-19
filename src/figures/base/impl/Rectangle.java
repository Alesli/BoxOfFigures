package figures.base.impl;


import figures.base.Figure;

import java.util.Objects;

/**
 * Class for getting the rectangle
 * <p>
 * Created on 15.04.2019
 *
 * @author Alesia Slizhova
 */
public abstract class Rectangle extends Figure {

    private static final long serialVersionUID = 1L;

    private double length;
    private double height;

    /**
     * Constructor that creates a rectangle.
     *
     * @param length side of a rectangle
     * @param height side of a rectangle
     */
    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Constructor that cuts out rectangle from any figure.
     *
     * @param figure, smaller length shape
     */
    public Rectangle(Figure figure) {
        this.length = figure.getMinSize() / 2;
        this.height = length;
    }


    /**
     * The method that determines the area of the rectangle
     *
     * @return double area
     */
    @Override
    public double getArea() {
        return height * length;
    }

    /**
     * The method that determines the perimeter of the rectangle
     *
     * @return double perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (height + length);
    }

    /**
     * toString override method
     *
     * @return String side, area, perimeter
     */
    @Override
    public String toString() {
        return "FilmRectangle: " +
                "length = " + length +
                ", height = " + height + ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() + ", " + getColour();
    }

    /**
     * The method returns a minimal side of the figure.
     *
     * @return double length
     */
    @Override
    public double getMinSize() {
        return Math.min(length, height);
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
        Rectangle rectangle = (Rectangle) object;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    /**
     * Overrides the hash code method
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(length, height);
    }
}
