package pl.javastart.task;

public class HardDrive extends Component {

    private int capacity;

    public HardDrive(String model, String producer, String serialNumber, int capacity) {
        super(model, producer, serialNumber);
        this.capacity = capacity;
    }
}
