package figures.film.impl;


import figures.base.Figure;
import figures.base.impl.EqualTriangle;
import figures.film.Film;

/**
 * Class creates a plastic figure triangle, inherits from the interface Film
 * <p>
 * Created on 14.04.2019
 *
 * @author Alesia Slizhova
 */
public class FilmEqualTriangle extends EqualTriangle implements Film {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor that creates a film triangle.
     *
     * @param side film figure
     */
    public FilmEqualTriangle(double side) {
        super(side);
    }

    /**
     * Constructor that creates a film triangle from any figure.
     *
     * @param filmFigure, smaller side shape
     */
    public FilmEqualTriangle(Film filmFigure) {
        super((Figure) filmFigure);

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) {
            return false;
        }
        FilmEqualTriangle filmEqualTriangle = (FilmEqualTriangle) object;
        return getSide() == this.getSide();
    }
}
