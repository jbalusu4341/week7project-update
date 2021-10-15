import java.util.ArrayList;
import java.util.List;

public abstract class BikeBuilder {
        String name;
        List<String> workshop = new ArrayList<String>();

        public abstract BikeBuilder addBikeName();
        public abstract BikeBuilder addWork();
        public abstract BikeBuilder addBikeNumber();
        public abstract BikeBuilder addCustomerName();
        public abstract BikeBuilder addCustomerNumber();

        public Bike build() {
            Bike bike = new Bike();
            bike.setName(this.name);
            bike.Bike(workshop);
            return bike;
        }
}
