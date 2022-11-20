import javax.persistence.EntityManager;

public class AccountDaoImpl implements AccountDao{

        @Override
        public boolean createAccount(Account account) {
            boolean flag= false;
            EntityManager em= EMUtil.provideEntityManager();
            em.getTransaction().begin();
            em.persist(account);
            flag=true;
            em.getTransaction().commit();
            em.close();
            return flag;
        }
        @Override
        public boolean deleteAccount(int accno) {
            boolean flag=false;
            EntityManager em= EMUtil.provideEntityManager();
            Account acc=em.find(Account.class, accno);
            if(acc != null){
                em.getTransaction().begin();
                em.remove(acc);
                flag=true;
                em.getTransaction().commit();
            }
            em.close();
            return flag;
        }
        @Override
        public boolean updateAccount(Account account) {
            boolean flag=false;
            EntityManager em= EMUtil.provideEntityManager();
            em.getTransaction().begin();
            em.merge(account);
            flag=true;
            em.getTransaction().commit();
            em.close();
            return flag;
        }
    @Override
    public Account findAccount(int accno) {

        return EMUtil.provideEntityManager().find(Account.class, accno);
    }


}
