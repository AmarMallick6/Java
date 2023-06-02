package methodoverriding;

public class Child extends parent {

	public static void main(String[] args) {
		parent obj1 =new Child();
		obj1.intRateofCar();  //output=value of child class method(5%)
       
		parent obj2 =new parent();
		obj2.intRateofCar();  //output=value of parent class method(7%)
		
		Child obj3 =new Child();
		obj3.intRateofCar();  //output=value of child class method(5%)
		
	//	Child obj4 =new parent();    //(output= can not convert parent to child)
		
	}
	 public void intRateofCar()
     {
		  System.out.println("5%");
     }
}
