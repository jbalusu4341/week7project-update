public class BikeAvailable implements Workshop {
    private Bike bike;

    public BikeAvailable(Bike bike) {
        this.bike = bike;
    }

    @Override
    public double calculateAmount() {
        return 0;
    }

    public void execute(){
       // bike.on();
    }
}
