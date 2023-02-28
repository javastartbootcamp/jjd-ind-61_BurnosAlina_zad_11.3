package pl.javastart.task;

public class Memory extends Component implements Overclockable {

    private static final int TEMP_INCREASE = 15;
    private int amount;
    private ComponentParameters parameters;

    public Memory(String model, String producer, String serialNumber, int amount, ComponentParameters parameters) {
        super(model, producer, serialNumber);
        this.amount = amount;
        this.parameters = parameters;
    }

    @Override
    public void overclock() {
        parameters.overclock(TEMP_INCREASE);
    }
}
