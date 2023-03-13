public class Room {
    private int width;
    private int length;
    private double temperatureAtTheBeginning;
    boolean airConditioningOn;
    MainAirConditioner whichConditioner;

    void belowORAbowDegreesPerMinute(double temperature) {
        MainAirConditioner mainAirConditioner = new MainAirConditioner();
        double tempPerMinute = getTemperatureAtTheBeginning();
        if(temperature> tempPerMinute) {
            do {
                tempPerMinute += (room.field() * whichConditioner;
                Thread.sleep(1000);
                System.out.printf("Aktualna temperatura: %.02f ", tempPerMinute);
                System.out.println();
            } while (tempPerMinute <= temperature);
        } else {
            do {
                tempPerMinute -= (room.field() * POWER);
                Thread.sleep(1000);
                System.out.printf("Aktualna temperatura: %.02f ", tempPerMinute);
                System.out.println();
            } while (tempPerMinute >= temperature);
        }

    }




    void getHigherDegrees(int howMany) {
        this.temperatureAtTheBeginning = temperatureAtTheBeginning + howMany;
    }

    public Room(int width, int length, double temperatureAtTheBeginning, boolean airConditioningOn) {
        this.width = width;
        this.length = length;
        this.temperatureAtTheBeginning = temperatureAtTheBeginning;
        this.airConditioningOn = airConditioningOn;
    }

    int field() {
        return this.length * this.width;
    }

    public Room(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public Room(int width, int length, double temperatureAtTheBeginning) {
        this.width = width;
        this.length = length;
        this.temperatureAtTheBeginning = temperatureAtTheBeginning;
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
}
