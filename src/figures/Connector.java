package figures;

import java.io.*;

/**
 * Класс сериализует и десериализует данные
 * Created on 30.05.2019
 *
 * @author Alesia Slizhova
 */
public class Connector {

//    public static final String FILE_PATH = "box.ser";
//
//    public static void saveToFile(Box box) {
//
//        File file = new File(FILE_PATH);
//        try (ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(file))) {
//            ostream.writeObject(box);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Box loadFromFile() {
//        Box box = null;
//        File file = new File(FILE_PATH);
//        try (ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file))) {
//            box = (Box) istream.readObject();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return box;
//    }
}
