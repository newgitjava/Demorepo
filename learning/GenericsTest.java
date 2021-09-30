package day14.learning;

public class GenericsTest {

	public static void main(String[] args) {
		
		MyGenericClass<String> s = new MyGenericClass<String>("Rohit");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		
		MyGenericClass<Integer> i = new MyGenericClass<>(789);
		i.displayObjectDetails();
		System.out.println(i.getObject());
		
		
		MyGenericClass<Double> d = new MyGenericClass<>(22.45);
		d.displayObjectDetails();
		System.out.println(d.getObject());


	}

}
