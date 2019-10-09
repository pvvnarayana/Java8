

interface MyInterface<T>{  
    abstract T add(T num, T num2);  
} 

public class DiamondOperator {

	public static void main(String[] args) {
		
		MyInterface<Integer> i = new MyInterface<Integer>() {
			public Integer add(Integer a, Integer b) {
				return a+b;
			}
		};
		
		System.out.println(i.add(2, 3));
	}
}
