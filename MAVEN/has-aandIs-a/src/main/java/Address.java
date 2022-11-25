import java.util.Objects;

public class Address {
    private String city;
    private String state;
    private String pincode;

    private String type;

    public Address() {
        super();
    }

    public Address(String city, String state, String pincode) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address(String city, String state, String pincode, String type) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city=" + city +
                ", state='" + state + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return city.equals(address.city) && state.equals(address.state) && pincode.equals(address.pincode) && type.equals(address.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, state, pincode, type);
    }
}
