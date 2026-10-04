public class FrontDesk {

    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {

        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public FrontDesk(Valet valet, HouseKeeping houseKeeping, Cart cart) {

        this.valet = valet;
        this.houseKeeping = houseKeeping;
        this.cart = cart;
    }

    public void requestValet(String plateNumber) {

        valet.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeeping(int roomNumber) {

        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {

        cart.requestCart(numberOfCarts);
    }
}