package functionPrograming;

public class X{
//	public void sayHello(String name) {
//		System.out.println("Welcome "+name);
//	}
//	public static void main(String[] args) {
//		Intr i1 = new X();
//		i1.sayHello("Rajat");
//		i1.fun1();
//		System.out.println(i1.equals(i1));
//		Intr.fun2();
//	}
	public static void main(String[] args) {
		Intr i1 = (n1,n2)->{
			return n1+n2;
		};
		
		Intr i2 = (n1,n2)-> n1+n2;
		System.out.println(i2.add(34,78));
		
		
		
	}

	
}