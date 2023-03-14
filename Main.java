public class Main {
    public static void main(String[] args) throws InterruptedException {
        BasicAirConditioner basic = new BasicAirConditioner(23);
        Room room1 = new Room(5,2,22,true,basic);
        basic.belowTemperature(room1);



    }
}
