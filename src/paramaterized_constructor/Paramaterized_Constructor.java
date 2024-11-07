package paramaterized_constructor;

public class Paramaterized_Constructor 
{
	int id=4567;
	int salary=123456;
	Paramaterized_Constructor(int id, int salary,String role,String  Experience) {
		//System.out.Println(id,salary,Experience);
		String h= id+salary +role;
	System.out.println("totalh h value:"+h);
	System.out.println("Totalvalues"+id+salary+role+Experience);
		
		
	}

	void subsoftheproduct() {
		//void Add() {
	    	 int Productcost= 24550988;
	    	 int numberofuser =3456;
	    	 int c=Productcost-numberofuser;
	    	 System.out.println(c);
	     }
	void muloftheproduct() {
		//void Add() {
	    	 int Productcost= 24550988;
	    	 int numberofuser =3456;
	    	 int c=Productcost*numberofuser;
	    	 System.out.println(c);
	     }
	void divoftheproduct() {
		//void Add() {
	    	 int Productcost= 24550988;
	    	 int numberofuser =3456;
	    	 int c=Productcost%numberofuser;
	    	 System.out.println(c);
	     }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Paramaterized_constructor obj=new Paramaterized_constructor(123,89000,"L1 Software Engineer Testing","10");
		Paramaterized_Constructor obj= new Paramaterized_Constructor(12,89000,"L1 Software Engineer Testing","10");
		
		obj.divoftheproduct();
		obj.muloftheproduct();
		obj.subsoftheproduct();
	}

}
