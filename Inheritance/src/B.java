
public class B {

	
	B(){
		
		System.out.println("constructor of Class B");
	}
	
	B(int a){
		this();
		System.out.println("a has "+a+"from contructor ");
	}
	
	void task() {
		System.out.println("helloo from class B");
	}
	
	
	static void sum(int j, int k) {
		System.out.println(j+k);
	}
	
	
	
}
