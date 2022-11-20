import java.util.Scanner;

public class DepositeUseCase {

    public static void main(String[] args) {
        AccountDao dao=new AccountDaoImpl();
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Account number");
//        int ano=sc.nextInt();
        int accno = sc.nextInt();
        String name = sc.next();
//        Account acc= dao.findAccount(ano);
        Account acc1=new Account();
        acc1.setName(name);
        acc1.setBalance(accno);
        boolean f= dao.createAccount(acc1);
        if(f)
            System.out.println("Account created..");
        else
            System.out.println("Not created...");
//        if(acc == null)
//            System.out.println("Account does not exist..");
//        else{
//            System.out.println("Enter the Amount to Deposit");
//            int amt=sc.nextInt();
//            acc.setBalance(acc.getBalance()+amt);
//            boolean f =dao.updateAccount(acc);
//            if(f)
//                System.out.println("Deposited Sucessfully...");
//            else
//                System.out.println("Technical Error .....");
//        }
    }


}
