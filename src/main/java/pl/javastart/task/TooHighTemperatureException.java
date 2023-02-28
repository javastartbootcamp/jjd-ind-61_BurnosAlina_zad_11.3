package pl.javastart.task;

public class TooHighTemperatureException extends RuntimeException {
    public TooHighTemperatureException(String message) {
        super(message);
    }
}
