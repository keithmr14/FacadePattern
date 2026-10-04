public class Valet implements HotelService {

    public void pickUpVehicle(String plateNumber) {

        System.out.println("Valet Service: Vehicle with plate number "
                + plateNumber + " has been retrieved.");
    }
}