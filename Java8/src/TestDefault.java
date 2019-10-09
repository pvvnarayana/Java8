
@FunctionalInterface
 interface Interface1 {

	default void m1() {
		System.out.println("Default method");
	}
	void m2();
}



 interface Interface2 extends Interface1{

	 void m1();
}
 
 public class TestDefault{

	public static void main(String[] args) {
		Interface1 i1 = () -> System.out.println("Hellow world");
		
		i1.m1();
		i1.m2();
	}
	 
 }
