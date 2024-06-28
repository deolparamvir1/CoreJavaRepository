package MultiLevelInheritance;

public class X extends Y{
	X(){
		//super(); is already there by default
		System.out.println("constructor of X");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=new X();

	}

}
