package figures.film.impl;


import figures.base.Figure;
import figures.base.impl.Rectangle;
import figures.film.Film;

/**
 * Class creates a plastic figure rectangle, inherits from the interface Film
 * <p>
 * Created on 14.04.2019
 *
 * @author Alesia Slizhova
 */
public class FilmRectangle extends Rectangle implements Film {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that creates a film rectangle.
     *
     * @param length side of a rectangle
     * @param height side of a rectangle
     */
    public FilmRectangle(double length, double height) {
        super(length, height);
    }

    /**
     * Constructor that creates a film rectangle from any figure.
     *
     * @param filmFigure, smaller side shape
     */
    public FilmRectangle(Film filmFigure) {
        super((Figure) filmFigure);

    }

}
