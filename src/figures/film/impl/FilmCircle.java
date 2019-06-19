package figures.film.impl;


import figures.base.Figure;
import figures.base.impl.Circle;
import figures.film.Film;

/**
 * Class creates a plastic figure circle, inherits from the interface Film
 * <p>
 * Created on 14.04.2019
 *
 * @author Alesia Slizhova
 */
public class FilmCircle extends Circle implements Film {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that creates a film circle.
     *
     * @param radius film figure
     */
    public FilmCircle(double radius) {
        super(radius);
    }

    /**
     * Constructor that creates a film circle from any figure.
     *
     * @param filmFigure - smaller shape
     */
    public FilmCircle(Film filmFigure) {
        super((Figure) filmFigure);

    }

}
