package figures.sort;


import figures.base.Figure;

import java.util.Comparator;

/**
 * Class that sorts shapes by form, inherited from the interface Comparator
 * Created on 14.05.2019
 *
 *  @author Alesia Slizhova
 */
public class FigureSortByForm implements Comparator<Figure> {
    @Override
    public int compare(Figure figure1, Figure figure2) {
        return figure1.getClass().getSuperclass().getSimpleName().
                compareTo(figure2.getClass().getSuperclass().getSimpleName());
    }
}
