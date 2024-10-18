package basicJava.org.com;
/*In these program we use (has-a)relationship and print employee address and employee details
 * we create two class 1 Address (it was a "Entity reference")for  class EMP
 * the relation develop b/w the both class is {Employee HAS-A Address}*/
public class EMP {

	int id;
	String name;
	Address address;
	
	public EMP(int id,String name,Address address ) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void Display() {//created display method to display details on console
		System.out.println("ID:"+id+" "+"NAME:"+name);
		System.out.println("ADDRESS IS:"+address.city+" "+address.state+" "+address.country);//it use the address class 
	}
	public static void main(String[] args) {
		Address address1=new Address("abc","mp","INDIA");//creates objects of address class in EMP class
		Address address2=new Address("bhd","UP","INDIA");
		
		EMP emp=new EMP(1,"lata",address1);//calling objects
		EMP emp1=new EMP(2,"Pinky",address2);
		emp.Display();//calling Display() method
		emp1.Display();
	}

}
