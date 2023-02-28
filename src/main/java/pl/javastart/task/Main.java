package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        ComponentParameters parameters1 = new ComponentParameters(3000, 25, 50);
        ComponentParameters parameters2 = new ComponentParameters(1066, 20, 60);
        Processor processor = new Processor("Aspire 5", "Acer", "159753", parameters1);
        Memory memory = new Memory("DDR4", "Lenovo", "123456", 4096, parameters2);
        HardDrive hardDrive = new HardDrive("superDrive", "DriveProducer", "789456", 128);
        Computer computer = new Computer(processor, memory, hardDrive);
        try {
            processor.overclock();
            processor.overclock();
            processor.overclock();
        } catch (TooHighTemperatureException e) {
            System.err.println(e.getMessage());
        }
    }
}
