public class MainAirConditioner{
    private double power;
    private double temperatuereToArhieve;


    void belowTemperature(Room room) throws InterruptedException {
        double temeraturePerMinute = room.getTemperatureAtTheBeginning();
        if(room.getTemperatureAtTheBeginning() > temperatuereToArhieve) {
            do{
                temeraturePerMinute += (room.field() * power);
                Thread.sleep(1000);
                System.out.printf("Aktualna temperatura w pokoju: %.02f", temeraturePerMinute);
                System.out.println();
            } while (temeraturePerMinute >= temperatuereToArhieve);
        } else {
            do{  temeraturePerMinute += (room.field() * power);
                Thread.sleep(1000);
                System.out.printf("Aktualna temperatura w pokoju: %.02f", temeraturePerMinute);
                System.out.println();
            } while (temeraturePerMinute <= temperatuereToArhieve);
        }
    }

    public MainAirConditioner(double power, double temperatuereToArhieve) {
        this.power = power;
        this.temperatuereToArhieve = temperatuereToArhieve;
    }
    public MainAirConditioner(double temperatuereToArhieve) {
        this.temperatuereToArhieve = temperatuereToArhieve;
    }
}


