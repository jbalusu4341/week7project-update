public class BikePrint implements State {
    Bike bike;

    public BikePrint(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void Publication() {
        System.out.println();
    }

    @Override
    public void Modify() {
        System.out.println();
    }
}
