/**
 * Created by softish on 2016-10-27.
 */
public class UnobtainableIPException extends RuntimeException {
    public UnobtainableIPException() {
    }

    public UnobtainableIPException(String message) {
        super(message);
    }

    public UnobtainableIPException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnobtainableIPException(Throwable cause) {
        super(cause);
    }

    public UnobtainableIPException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
