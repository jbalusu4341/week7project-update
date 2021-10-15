public class BikePublication implements State {
    Bike bike;

    public BikePublication(Bike bike) {
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
