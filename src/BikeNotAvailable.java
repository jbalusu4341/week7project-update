public class BikeNotAvailable implements Workshop {
    private Bike bike;

    public BikeNotAvailable(Bike bike) {
        this.bike = bike;
    }

    @Override
    public double calculateAmount() {
        return 0;
    }

    public void execute(){
       // bike.off();
    }

}
