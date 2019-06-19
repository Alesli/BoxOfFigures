package figures;


import figures.base.Color;
import figures.base.Figure;
import figures.exception.InvalidCellNumberException;
import figures.exception.NumberOutOfBoundsException;
import figures.film.Film;
import figures.film.impl.FilmCircle;
import figures.paper.impl.PaperCircle;
import figures.sort.FigureSortByArea;
import figures.sort.FigureSortByColor;
import figures.sort.FigureSortByForm;

import java.util.ArrayList;
import java.util.List;

/**
 * The class creates a box with figures
 * Created on 02.05.2019
 *
 * @author Alesia Slizhova
 */
public class Box {

    private List<Figure> figureList = new ArrayList<>();

    /**
     * Method that returns the number of all the figures in the box.
     *
     * @return the number of all the figures
     */
    int getCount() {
        return figureList.size();
    }

    /**
     * Method which shows all figures in the box.
     */
    public List<Figure> showFigures() {
        return figureList;
    }

    /**
     * Method that compares figures
     *
     * @param figure - the figure to insert
     * @return figureInBox - figure in box equal to incoming
     */
    private Figure equalFigures(Figure figure) {
        for (Figure figureInBox : figureList) {
            if (figureInBox.equals(figure)) {
                return figureInBox;
            }
        }
        return null;
    }

    /**
     * The method for putting figures in a box.
     *
     * @param figure - the figure to insert
     */
   public void put(Figure figure) {
        if (equalFigures(figure) == null) {
            figureList.add(figure);
        }
    }

    /**
     * The method which show a figure by number.
     *
     * @param number figure
     */
    public Figure getFigure(int number) throws NumberOutOfBoundsException {
        if (!(number > 0 & number < figureList.size())) throw new NumberOutOfBoundsException("Неверное число: " + number);
        return figureList.get(number - 1);
    }

    /**
     * Method for replacing figures in the box by number.
     *
     * @param number - the number of the figure in the box
     * @param figure - figure to replace
     * @return figure
     */
    public Figure setFigure(int number, Figure figure) throws  NumberOutOfBoundsException{
        int index = number- 1;
        if (!(number > 0 & number < figureList.size())) throw new NumberOutOfBoundsException("Фигуры с порядковым номером " + number + " нет в коллекции");
        figureList.remove(index);
        if (equalFigures(figure) == null) {
            figureList.add(index, figure);
        }
        return figure;
    }

    /**
     * Deleting a shape by index
     *
     * @param number - the number of the figure in the box
     */
    public Figure removeFigure(int number) throws InvalidCellNumberException {
        int index = number - 1;
        if (!(number > 0 & number < figureList.size())) throw new InvalidCellNumberException("Неверное число: "+ number);
        Figure figure = figureList.get(index);
        figureList.remove(figure);
        return figure;
    }

    /**
     * The method in which the figure is sought after the pattern
     *
     * @param fig - figure to find
     * @return true if the figure is found
     */
    boolean findByFigure(Figure fig) {
        if (fig == null) {
            return false;
        }
        for (Figure figure1 : figureList) {
            if (fig.equals(figure1)) {
                return true;
            }
        }
        return false;
    }

    /**
     * The method which calculates the sum perimeters of figures in the box.
     *
     * @return perimeter figures
     */

    double sumPerimeter() {
        double perimeter = 0;

        for (Figure fig : figureList) {
            if (fig != null) {
                perimeter += fig.getPerimeter();
            }
        }
        return figures.Round.getRound(perimeter);
    }

    /**
     * The method which calculates the sum squares of figures in the box.
     *
     * @return area figures
     */
    double sumArea() {
        double area = 0;

        for (Figure fig : figureList) {
            if (fig != null) {
                area += fig.getArea();
            }
        }
        return Round.getRound(area);
    }

    /**
     * The method gets all the circles
     */
    List<Figure> getAllCircles() {
        ArrayList<Figure> circleFigureList = new ArrayList<>();
        for (Figure fig : figureList) {
            if (fig instanceof PaperCircle || fig instanceof FilmCircle) {
                circleFigureList.add(fig);
            }
        }
        return circleFigureList;
    }

    /**
     * The method gets all the film figures
     */
    List<Figure> getAllFilmFigures() {
        ArrayList<Figure> filmFigureList = new ArrayList<>();
        for (Figure fig : figureList) {
            if (fig instanceof Film) {
                //  System.out.println(fig);
                filmFigureList.add(fig);
            }
        }
        return filmFigureList;
    }


    List<Figure> getRedCircles() {
        ArrayList<Figure> redCircles = new ArrayList<>();
        for (Figure figure : figureList) {
            if (figure instanceof PaperCircle && (figure).getColour().equals(Color.Colour.RED)) {
                redCircles.add(figure);
            }
        }
        return redCircles;
    }

    List<Figure> getAllFigures(Class c) {
        List<Figure> allFig = new ArrayList<>();
        for (Figure figure : figureList) {
            if (figure.getClass() == c) {
                allFig.add(figure);
            } else if (figure.getClass().getSuperclass() == c) {
                allFig.add(figure);
            }
        }
        return allFig;
    }

    // Второй вариант вывода всех фигур по заданному условию

    List<Figure> getAllFig(String figureName) {
        if (figureName.equalsIgnoreCase("Circle") || figureName.equalsIgnoreCase("EqualTriangle") ||
                figureName.equalsIgnoreCase("Rectangle")) {
            ArrayList<Figure> allFigures = new ArrayList<>();
            for (Figure figure : figureList) {
                if (figure.getClass().getName().toLowerCase().contains(figureName.toLowerCase())) {
                    allFigures.add(figure);
                }
            }
            return allFigures;
        }
        return null;
    }

    // ------ сортировка фигур -----------

    private void print(List<?> list) {
        list.forEach(System.out::println);
    }

    void sortByForm() {
        figureList.sort(new FigureSortByForm());
        print(figureList);
    }

    void sortByArea() {
        figureList.sort(new FigureSortByArea());
        print(figureList);
    }

    void sortByColor() {
        figureList.sort(new FigureSortByColor());
        print(figureList);
    }

    @Override
    public String toString() {
        for (Figure figure : figureList) {
            System.out.println(figure + "\n");
        }
        return "";
    }
}
