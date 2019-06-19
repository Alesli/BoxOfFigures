package figures;


import figures.base.Figure;
import figures.exception.Connector;
import figures.film.impl.FilmCircle;
import figures.film.impl.FilmEqualTriangle;
import figures.film.impl.FilmRectangle;
import figures.paper.impl.PaperCircle;
import figures.paper.impl.PaperEqualTriangle;
import figures.paper.impl.PaperRectangle;

import java.io.IOException;
import java.util.List;

import static figures.base.Color.Colour.*;
import static figures.exception.Connector.FILE_PATH;

/**
 * A class that displays the result of all methods
 * Created on 01.05.2019
 *
 * @author Alesia Slizhova
 */
public class Main {

        public static void main(String[] args) {

        /* Создаем пленочные фигуры */
        FilmCircle fc1 = new FilmCircle(10);
        fc1.setColour(UNPAINTED);
        fc1.setFigure(true);
        FilmEqualTriangle fet1 = new FilmEqualTriangle(18);
        fet1.setColour(UNPAINTED);
        FilmRectangle fr1 = new FilmRectangle(7, 5);
        fr1.setColour(UNPAINTED);

        /* Создаем бумажные фигуры и красим их */
        PaperCircle pc1 = new PaperCircle(4);
        pc1.setColour(WHITE);
        PaperCircle pc2 = new PaperCircle(6);
        pc2.setColour(RED);
        PaperEqualTriangle pet1 = new PaperEqualTriangle(11);
        pet1.setColour(RED);
        PaperRectangle pr1 = new PaperRectangle(7, 6);
        pr1.setColour(YELLOW);

        PaperRectangle pr2 = new PaperRectangle(13, 8);
        pr2.setColour(GREEN);

        PaperRectangle paperRectangle = new PaperRectangle(8, 4);
        paperRectangle.setColour(AQUAMARINE);

        /* Создаем коробку */
        Box boxes = new Box();
// -----------------------

        /* Добавить фигуру в коробку */
        boxes.put(pc1);
        boxes.put(pr1);
        boxes.put(pet1);
        boxes.put(fc1);
        boxes.put(fet1);
        boxes.put(pc2);
        //boxes.put(fr1);
        boxes.put(fr1);

            try {
                System.out.println("Данные записаны в файл");
                Connector.writeBox(FILE_PATH, boxes);
            } catch (IOException e) {
                e.printStackTrace();
            }

        Box box = Connector.readBox(FILE_PATH);
        System.out.println(box);



        /* Просмотреть фигуру по номеру */
//        System.out.println("\t" + "Просмотреть фигуру по номеру ");
//        try {
//            System.out.println(boxes.getFigure(2));
//        } catch (NumberOutOfBoundsException e) {
//            e.printStackTrace();
//        }

        /* Извлечь фигуру по номеру */
        //   System.out.println("Данная фигура будет удалена: " + boxes.removeFigure(2));

        /* Заменить по номеру */
//        try {
//            System.out.println("Фигура, на которую заменили: " + boxes.setFigure(1, paperRectangle));
//        } catch (NumberOutOfBoundsException e) {
//            e.printStackTrace();
//        }

//        System.out.println("Результат поиска фигуры по образцу - " + boxes.findByFigure(pc1));
//
//        System.out.println("Наличное количество фигур равно " + boxes.getCount());
//
//        System.out.println("Суммарная площадь = " + boxes.sumArea());
//
//        System.out.println("Суммарный периметр = " + boxes.sumPerimeter());
//
//        System.out.println("\t" + "Все круги в коробке: ");
//        List<Figure> allCircles = boxes.getAllCircles();
//        iterator(allCircles);
//
//        System.out.println("\t" + "Все пленочные фигуры в коробке: ");
//        List<Figure> filmFigures = boxes.getAllFilmFigures();
//        iterator(filmFigures);
//
//        System.out.println("\t" + "Все красные круги в коробке: ");
//        List<Figure> redCircles = boxes.getRedCircles();
//        iterator(redCircles);
//
//        /* Показать все  фигуры */
//        System.out.println("+++++++++++++++++");
//        boxes.showFigures();
////
//        System.out.println("\t" + "Все треугольники в коробке: ");
//        List<Figure> rectangles = boxes.getAllFigures(FilmRectangle.class);
//        iterator(rectangles);
//
//        System.out.println("\t" + "Все круги в коробке: ");
//        List<Figure> circles = boxes.getAllFig("circle");
//        iterator(circles);

//        System.out.println("\t" + "Сортировка по форме:");
//        boxes.sortByForm();
//
//        System.out.println("\t" + "Сортировка по площади:");
//        boxes.sortByArea();
//
//        System.out.println("\t" + "Сортировка по цвету:");
//        boxes.sortByColor();
//
//        System.out.println("------- Вырезаем фигуры --------");
//        PaperCircle paperCircle = new PaperCircle(pr1);
//        boxes.put(paperCircle);
//
//        PaperRectangle paperRectangle = new PaperRectangle(pr2);
//        boxes.put(paperRectangle);
//        boxes.showFigures();

//        System.out.println(boxes.toString());
//        try{
//            Connector writeBox(fileName, box);
//        }catch (MySerDeserException e){
//            if ( )
//        }


    }

    private static void iterator(List<Figure> list) {
        for (Figure figure : list) {
            System.out.println(figure);
        }
    }
}
