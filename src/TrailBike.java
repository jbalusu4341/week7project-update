public class TrailBike extends BikeBuilder{

    public TrailBike() {
        this.name = "Trail Bike";
    }

    @Override
    public BikeBuilder addBikeName() {
        this.workshop.add("Trail Bike");
        return this;
    }

    @Override
    public BikeBuilder addWork() {
        this.workshop.add("Bike Maintenance");
        return this;
    }

    @Override
    public BikeBuilder addBikeNumber() {
        this.workshop.add("Bike Number LED-700");
        return this;
    }

    @Override
    public BikeBuilder addCustomerName() {
        this.workshop.add("Jagadeesh Babu Balusu");
        return this;
    }

    @Override
    public BikeBuilder addCustomerNumber() {
        this.workshop.add("12345");
        return this;
    }
}
