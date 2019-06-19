package figures.exception;

import figures.Box;
import figures.base.Figure;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zf on 30.05.2019.
 */
public class Connector {

    public static final String FILE_PATH = "box.ser";

    public static void writeBox(String fileName, Box box) throws IOException {

        Path path = Paths.get(fileName);

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            for (Figure figure : box.showFigures()) {
                oos.writeObject(figure);
            }
        } catch (FileNotFoundException e) {
            throw new MySerDeserException("File" + fileName + "was not found", e);
        } catch (IOException e) {
            throw new MySerDeserException("There was an input output error", e);
        }

    }

    public static Box readBox(String fileName){

        Box deserBox = new Box();
        Object figure;
        Path path = Paths.get(fileName);

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            while ((figure = ois.readObject()) != null){
                if (figure instanceof Figure)
                    deserBox.put((Figure)figure);
            }
        }catch (EOFException e){
            return deserBox;
        }catch (ClassNotFoundException e) {
            throw new MySerDeserException("Class not found", e);
        }catch (FileNotFoundException e){
            throw  new MySerDeserException("File" + fileName + "was not found",e);
        }catch (IOException e) {
            throw new MySerDeserException("There was an input output error", e);
        } return deserBox;
        }
    }


