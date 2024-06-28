package MultiLevel;

public class A extends B{

	
	int num=90;
	
	
	void print() {
		System.out.println(this.num);//is the same thing as num   
		System.out.println(super.num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A o =new A();
		
		System.out.println(o.num);
		
		o.print();
		
		
	}

}
