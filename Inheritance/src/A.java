
public class A extends B {

	
	
	void welcome() {
		System.out.println("welcome");
	}
	
//	A(){
//		//super();//default statement if performing inheritance.
//	
//	}
	
	
	A(){
		super(23);
		//this(23);
		System.out.println("this is a child class constructor");
	}
	
	
	A(int a){
		super();// parent class consructor with arguments
		System.out.println("this is the child class constructor with values");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a= new A();
		sum(40,30);
		//a.welcome();
//		
//		B b= new B();
//		b.task();
//		
		
		//a.task();
		
	}

}
