import java.text.DecimalFormat;

public class BasicAirConditioner extends MainAirConditioner {
    private  final double  POWER = 0.01;



    void belowORAbowDegreesPerMinute(Room room, double temperature) throws InterruptedException {
        double tempPerMinute = room.getTemperatureAtTheBeginning();
        if(temperature> tempPerMinute) {
            do {
                tempPerMinute += (room.field() * POWER);
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

}
