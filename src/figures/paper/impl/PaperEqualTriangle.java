package figures.paper.impl;


import figures.base.Figure;
import figures.base.impl.EqualTriangle;
import figures.paper.Paper;

import java.util.Objects;

/**
 * Class creates a plastic figure circle, inherits from the interface Film
 * <p>
 * Created on 17.04.2019
 *
 * @author Alesia Slizhova
 */
public class PaperEqualTriangle extends EqualTriangle implements Paper {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that creates a paper triangle.
     *
     * @param side paper figure
     */
    public PaperEqualTriangle(double side) {
        super(side);
    }

    /**
     * Constructor that creates a paper triangle from any figure.
     *
     * @param paperFigure, smaller side shape
     */
    public PaperEqualTriangle(Paper paperFigure) {
        super((Figure) paperFigure);
        painting = ((Figure) paperFigure).getPainting();
    }

    /**
     * toString override method.
     *
     * @return paper triangle
     */
    @Override
    public String toString() {
        return "PaperEqualTriangle: " + "side = " + this.getSide() +
                ", color = " + getColour() + " , площадь = " + getArea() + " , периметр = " + getPerimeter();
    }

    /**
     * equals override method.
     *
     * @param object, input parameter to compare
     * @return side comparison result
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        PaperEqualTriangle paperEqualTriangle = (PaperEqualTriangle) object;
        return Objects.equals(getPainting(), paperEqualTriangle.getPainting());
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
