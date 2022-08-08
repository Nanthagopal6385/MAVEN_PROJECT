package Com.poja;

public class pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A a = new Pojo_A();
		
		int age = a.getAge();
		
		System.out.println("Age : "+age);
		
		a.setAge(12);
		
		System.out.println("After setters");
		
		int age_1 = a.getAge();
		
		System.out.println(age_1);
		
		
		
		
	}

}
