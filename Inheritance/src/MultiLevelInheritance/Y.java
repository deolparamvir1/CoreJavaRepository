package MultiLevelInheritance;

public class Y extends Z{

	
	
	Y(){
		this(89);//this is used to access current class resources
		
		System.out.println("constructor of Y");
		
	}
	
	Y(int j){
		System.out.println("this is the constructor of Y"+j);
	}
	
	
	
	
}
