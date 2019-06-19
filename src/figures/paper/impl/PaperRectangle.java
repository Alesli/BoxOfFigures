package figures.paper.impl;


import figures.base.Figure;
import figures.base.impl.Rectangle;
import figures.paper.Paper;

import java.util.Objects;

/**
 * Class creates a plastic figure circle, inherits from the interface Film
 * <p>
 * Created on 17.04.2019
 *
 * @author Alesia Slizhova
 */
public class PaperRectangle extends Rectangle implements Paper {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that creates a paper rectangle.
     *
     * @param length side of a rectangle
     * @param height side of a rectangle
     */
    public PaperRectangle(int length, int height) {
        super(length, height);
    }

    /**
     * Constructor that creates a paper rectangle from any figure.
     *
     * @param paperFigure, smaller shape
     */
    public PaperRectangle(Paper paperFigure) {
        super((Figure) paperFigure);
        painting = ((Figure) paperFigure).getPainting();
    }

    /**
     * toString override method.
     *
     * @return paper rectangle
     */
    @Override
    public String toString() {
        return "PaperRectangle: " + "length = " + this.getLength() + " height = " + this.getHeight() +
                " color = " + getColour() + " , площадь = " + getArea() + " , периметр = " + getPerimeter();
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
        PaperRectangle paperRectangle = (PaperRectangle) object;
        return Objects.equals(getPainting(), paperRectangle.getPainting());
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
