package figures.exception;

/**
 * Created by zf on 30.05.2019.
 */
public class MySerDeserException extends RuntimeException{

    public MySerDeserException() {
        super();
    }

    public MySerDeserException(String message) {
        super(message);
    }

    public MySerDeserException(Throwable cause) {
        super(cause);
    }

    public MySerDeserException(String message, Throwable cause) {
        super(message, cause);
    }


}
