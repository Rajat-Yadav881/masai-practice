import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long vehicleId;
    private String manufacturer;

    public Vehicle(long vehicleId, String manufacturer) {
        this.vehicleId = vehicleId;
        this.manufacturer = manufacturer;
    }

    public Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Vehicle() {
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
