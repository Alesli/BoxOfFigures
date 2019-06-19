package figures.sort;


import figures.base.Figure;

import java.util.Comparator;

/**
 * Class that sorts shapes by area, inherited from the interface Comparator
 * Created on 14.05.2019
 *
 *  @author Alesia Slizhova
 */
public class FigureSortByArea implements Comparator<Figure> {
    @Override
    public int compare(Figure figure1, Figure figure2) {
        return (int) (figure1.getArea() - figure2.getArea());
    }
}
