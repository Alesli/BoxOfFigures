package figures.paper.impl;


import figures.base.Figure;
import figures.base.impl.Circle;
import figures.paper.Paper;

import java.util.Objects;

/**
 * Class creates a plastic figure circle, inherits from the interface Film
 * <p>
 * Created on 14.05.2019
 *
 * @author Alesia Slizhova
 */
public class PaperCircle extends Circle implements Paper {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that creates a paper circle.
     *
     * @param radius figure
     */
    public PaperCircle(int radius) {
        super(radius);
    }

    /**
     * Constructor that creates a paper circle from any figure.
     *
     * @param paperFigure, smaller shape
     */
    public PaperCircle(Paper paperFigure) {
        super((Figure) paperFigure);
        painting = ((Figure) paperFigure).getPainting();
    }

    /**
     * toString override method.
     *
     * @return paper circle
     */
    @Override
    public String toString() {
        return "PaperCircle: " +
                "radius = " + this.getRadius() +
                ", color = " + getColour() + " , площадь = " + getArea() + " , периметр = " + getPerimeter();
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
        PaperCircle paperCircle = (PaperCircle) object;
        return Objects.equals(getPainting(), paperCircle.getPainting());
    }

    /**
     * Overrides the hash code method
     *
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPainting());
    }
}
