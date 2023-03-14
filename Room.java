public class Room {
    private int width;
    private int length;
    private double temperatureAtTheBeginning;
    boolean airConditioningOn;
    MainAirConditioner whichConditioner;

    public Room(int width, int length, double temperatureAtTheBeginning, boolean airConditioningOn, MainAirConditioner whichConditioner) {
        this.width = width;
        this.length = length;
        this.temperatureAtTheBeginning = temperatureAtTheBeginning;
        this.airConditioningOn = airConditioningOn;
        this.whichConditioner = whichConditioner;
    }

    int field () {
        return this.width * this.length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTemperatureAtTheBeginning() {
        return temperatureAtTheBeginning;
    }

    public void setTemperatureAtTheBeginning(double temperatureAtTheBeginning) {
        this.temperatureAtTheBeginning = temperatureAtTheBeginning;
    }

    public boolean isAirConditioningOn() {
        return airConditioningOn;
    }

    public void setAirConditioningOn(boolean airConditioningOn) {
        this.airConditioningOn = airConditioningOn;
    }

    public MainAirConditioner getWhichConditioner() {
        return whichConditioner;
    }

    public void setWhichConditioner(MainAirConditioner whichConditioner) {
        this.whichConditioner = whichConditioner;
    }
}
