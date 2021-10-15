public class Customer {
    //Declaring Variables
    private int id;
    private String PersonName;
    private String CNIC;
    private String address;

    //No parameterized Constructor
    public Customer() {
    }

    //Fully Parameterized Constructor
    public Customer(int id, String PersonName, String CNIC, String address) {
        this.id = id;
        this.PersonName = PersonName;
        this.CNIC = CNIC;
        this.address = address;
    }

    //Setters and Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
