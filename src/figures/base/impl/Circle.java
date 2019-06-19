package figures.base.impl;


import static figures.Round.getRound;
import static java.lang.Math.pow;
import figures.base.Figure;

import java.util.Objects;

/**
 * Class for getting the circle
 * <p>
 * Created on 15.04.2019
 *
 * @author Alesia Slizhova
 */
public abstract class Circle extends Figure {

    private static final long serialVersionUID = 1L;

    private double radius;

    /**
     * Constructor that creates a circle.
     *
     * @param radius double
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor that creates a circle from any figure.
     *
     * @param figure, smaller radius shape
     */
    public Circle(Figure figure) {
        this.radius = figure.getMinSize();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * The method which calculates a perimeter of circle.
     *
     * @return double area
     */
    @Override
    public double getArea() {
        double area = PI * pow(radius, 2);
        return getRound(area);
    }

    /**
     * The method which calculates a square of circle.
     *
     * @return double perimeter
     */
    @Override
    public double getPerimeter() {
        double perimeter = 2 * PI * radius;
        return getRound(perimeter);
    }

    /**
     * The method returns a minimal side of the figure.
     *
     * @return double radius
     */
    @Override
    public double getMinSize() {
        return radius / 2;
    }

    /**
     * toString override method
     *
     * @return String side, area, perimeter
     */
    @Override
    public String toString() {
        return "FilmCircle: " +
                "radius = " + radius + ", площадь = " + getArea() +
                ", периметр = " + getPerimeter() + ", " + getColour()+ ", + , несериализуемое поле - " + super.isFigure();
    }

    /**
     * equals override method.
     *
     * @param object, input parameter to compare
     * @return radius comparison result
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        Circle circle = (Circle) object;
        return Double.compare(circle.radius, radius) == 0;
    }

    /**
     * Overrides the hash code method
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
