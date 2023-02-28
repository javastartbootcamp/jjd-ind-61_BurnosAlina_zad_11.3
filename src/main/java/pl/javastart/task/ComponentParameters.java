package pl.javastart.task;

public class ComponentParameters {

    static final int ADDITIONAL_FREQUENCY = 100;
    private int frequency;
    private int currentTemp;
    private int maxTemp;

    public ComponentParameters(int frequency, int currentTemp, int maxTemp) {
        this.frequency = frequency;
        this.currentTemp = currentTemp;
        this.maxTemp = maxTemp;
    }

    private void increaseFrequency() {
        frequency += ADDITIONAL_FREQUENCY;
    }

    private int increaseTemp(int temp) {
        return currentTemp += temp;
    }

    private boolean canFrequencyBeIncrease(int increaseTemp) {
        return currentTemp + increaseTemp < maxTemp;
    }

    void overclock(int increaseTemp) {
        if (canFrequencyBeIncrease(increaseTemp)) {
            increaseTemp(increaseTemp);
            increaseFrequency();
        } else {
            throw new TooHighTemperatureException("Nie można więcej podkręcić, ryzyko przegrzania!");
        }
    }

    public int getMaxTemp() {
        return maxTemp;
    }
}
