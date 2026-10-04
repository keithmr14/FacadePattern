public class HouseKeeping implements HotelService {

    public void cleanRoom(int roomNumber) {

        System.out.println("HouseKeeping Service: Cleaning scheduled for room number "
                + roomNumber + ".");
    }
}