import javax.persistence.*;
import javax.persistence.criteria.Fetch;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String ename;
    private int Salary;

//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "State",column=@Column(name = "homeState")),
//            @AttributeOverride(name = "City",column=@Column(name = "homeCity")),
//            @AttributeOverride(name = "pincode",column=@Column(name = "homePin"))
//    })
//    private Address homeAddress;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "State",column=@Column(name = "officeState")),
//            @AttributeOverride(name = "City",column=@Column(name = "officeCity")),
//            @AttributeOverride(name = "pincode",column=@Column(name = "officePin"))
//    })
//    private Address officeAdress;
    @Embedded
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "address",joinColumns = @JoinColumn(name = "empId"))
    private Set<Address> addresses = new HashSet<Address>();



    public Employee() {
    }

    public Employee(int eid, String ename, int salary, Set<Address> addresses) {
        this.eid = eid;
        this.ename = ename;
        Salary = salary;
        this.addresses = addresses;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}
