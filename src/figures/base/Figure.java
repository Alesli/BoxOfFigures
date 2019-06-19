package figures.base;


import java.io.Serializable;

/**
 * Abstract class for getting the area, perimeter, size of
 * paper and plastic figures
 * <p>
 * Created on 16.04.2019
 *
 * @author Alesia Slizhova
 */
public abstract class Figure implements Color, Serializable {

    private static final long serialVersionUID = 1L;

    private transient boolean isFigure;

    protected Painting painting = new Painting();

    protected static final double PI = Math.PI;

    /**
     * Perimeter calculation method.
     *
     * @return double, figure perimeter
     */
    public abstract double getPerimeter();

    /**
     * Square calculation method.
     *
     * @return double, figure area
     */
    public abstract double getArea();

    /**
     * The method of calculation a minimal size.
     *
     * @return String, minimum size
     */
    public abstract double getMinSize();

    @Override
    public boolean equals(Object o) {
        return o != null && getClass() == o.getClass();
    }

    /**
     * The method which shows colour of the figure.
     *
     * @return color
     */
    @Override
    public Colour getColour() {
        return painting.getColour();
    }

    /**
     * The method which paints a figure.
     *
     * @param colour figure
     */
    @Override
    public void setColour(Colour colour) {
        painting.setColour(colour);
    }

    /**
     * Method for painting a figures.
     *
     * @return possibility of painting
     */
    public Painting getPainting() {
        return painting;
    }

    public boolean isFigure() {
        return isFigure;
    }

    public void setFigure(boolean figure) {
        isFigure = figure;
    }

    /**
     * Inner class for painting a figures.
     * Created on 19.04.2019
     *
     * @author Alesia Slizhova
     */
    class Painting implements Serializable {
        private Colour colour;

        Colour getColour() {
            return colour;
        }

        void setColour(Colour colour) {
            if (this.colour == null) {
                this.colour = colour;
            }
        }
    }
}
