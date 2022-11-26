import com.mysql.cj.xdevapi.AddResult;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        EntityManager em = EMUtility.provideEntityManager();

        Employee employee = em.find(Employee.class,1);
        em.close();

        System.out.println(employee.getEid());
        System.out.println(employee.getEname());
        System.out.println(employee.getSalary());

        System.out.println("All Address are:- ");
        System.out.println("=======================");
        Set<Address> addresses = employee.getAddresses();

        for (Address adr: addresses){
            System.out.println(adr.getCity());
            System.out.println(adr.getState());
            System.out.println(adr.getPincode());

            System.out.println("**************************");

        }
        System.out.println("Done...");

    }
}
