package AbstractionClassesAndInterfaces.two;

 class  AccessModfier {
     protected void display()
     {
         System.out.println("GeeksforGeeks");
     }
 }

class B
{
    public static void main(String args[])
    {
        AccessModfier obj = new AccessModfier();
        // Trying to access private method
        // of another class
        obj.display();
    }
}