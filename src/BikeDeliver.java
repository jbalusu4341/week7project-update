public class BikeDeliver implements State {
    Bike bike;

    public BikeDeliver(Bike bike) {
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
