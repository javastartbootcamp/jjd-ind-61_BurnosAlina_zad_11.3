package pl.javastart.task;

public class Processor extends Component implements Overclockable {

    private static final int TEMP_INCREASE = 10;
    private ComponentParameters parameters;

    public Processor(String model, String producer, String serialNumber, ComponentParameters parameters) {
        super(model, producer, serialNumber);
        this.parameters = parameters;
    }

    @Override
    public void overclock() {
        parameters.overclock(TEMP_INCREASE);
    }
}