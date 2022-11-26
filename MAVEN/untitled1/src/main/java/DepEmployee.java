import javax.persistence.Entity;

@Entity
public class DepEmployee extends Person{
    private String company;

    public DepEmployee(long personId, String name, String company) {
        super(personId, name);
        this.company = company;
    }

    public DepEmployee(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
