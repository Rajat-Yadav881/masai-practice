import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMStility {
    private static EntityManagerFactory emf;
    static{
        emf= Persistence.createEntityManagerFactory("accountUnit");
    }
    public static EntityManager provideEntityManager(){
        return emf.createEntityManager();
    }
}
