package pl.javastart.task;

public class ComponentParameters {

    static final int ADDITIONAL_FREQUENCY = 100;
    private int frequency;
    private int optimalTemp;
    private int maxTemp;

    public ComponentParameters(int frequency, int optimalTemp, int maxTemp) {
        this.frequency = frequency;
        this.optimalTemp = optimalTemp;
        this.maxTemp = maxTemp;
    }

    private void increaseFrequency() {
        frequency += ADDITIONAL_FREQUENCY;
    }

    private int increaseTemp(int temp) {
        return optimalTemp += temp;
    }

    void overclock(int increaseTemp) {
        if (increaseTemp(increaseTemp) < maxTemp) {
            increaseFrequency();
        } else {
            throw new TooHighTemperatureException("Nie można więcej podkręcić, ryzyko przegrzania!");
        }
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}
