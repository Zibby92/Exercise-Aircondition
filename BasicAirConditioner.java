import java.text.DecimalFormat;

public class BasicAirConditioner extends MainAirConditioner {
    private final double power = 0.01;




    public BasicAirConditioner(double power, double temperatuereToArhieve) {
        super(power, temperatuereToArhieve);
    }

    @Override
    void belowTemperature(Room room) throws InterruptedException {
        super.belowTemperature(room);
    }


}