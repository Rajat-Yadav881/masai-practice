import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("accountUnit");
        EntityManager em = emf.createEntityManager();
        Employee employee = em.find(Employee.class,3);
        em.close();
        System.out.println(employee.getEid());
        System.out.println(employee.getEname());

        Set<Address> addressSet = employee.getAddresses();
        for (Address ad : addressSet){
            System.out.println(ad.getCity());
        }
        System.out.println("Done...");
//        Employee employee = new Employee();
//        employee.setEname("rajat");
//        employee.setSalary(230);
//        employee.getAddresses().add(new Address("A","Pune","243535","home"));
//        employee.getAddresses().add(new Address("B","hyd","4321","office"));
//        em.getTransaction().begin();
//        em.persist(employee);
//        em.getTransaction().commit();
//        em.close();
    }
}
