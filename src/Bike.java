import java.util.List;

public class Bike {
    String name;
    List<String> bikes;
    int count = 0;

    void Bike(List<String> bikes) {
        this.bikes = bikes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bike(String name) {
        this.name = name;
    }

    public String getBike() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("<<-Bike Processing->>");
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}
