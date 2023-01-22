import javax.persistence.EntityManager;

public class Demo1 {
    public static void main(String[] args) {
        EntityManager em = EMStility.provideEntityManager();

        DepEmployee employee = new DepEmployee(45,"rakesh","TCS");

        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
    }
}
