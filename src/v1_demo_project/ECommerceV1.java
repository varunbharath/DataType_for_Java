package v1_demo_project;

public class ECommerceV1 {
	
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		//Signupscreen
		String Username= "bharath";
		float Mobilenumber= 8220113955f;
		 String Emailid="123@gmail.com";
		 String Password= "1234567";
		  int  Age =25;
		String Premiumuser="Yes";
		 String Signupdetails=Username+Mobilenumber+Emailid+Age+Premiumuser;
		 System.out.println("SIGNUPPAGEDETAILS:"+ Signupdetails); 
  
		// login Page
		 String username= "bharath";
		 String password="12345678";
		 System.out.println("Login Page  Details"+username+password);
		 // Elctronicsproduct
		 
		 String Productname="DellLaptop";
		 String Model ="vm57";
		 int cost=98765;
		 String Ram ="16GB";
		 String Color = "Black with white";
		 String lifetime = "1500days";
		 String Product_Details1=Productname+Model+cost+Color+Ram+lifetime;
		 System.out.println("Productdetails;"+Product_Details1);
		 
		 //mobile 
		 
		 String Mobilename="Apple";
		 String Model1 ="15 pro";
		 int Price=178900;
		 String Ram1 ="120GB";
		 String Colour = "Black";
		
		 String Product_Details2=Productname+Model1+Price+Colour+Ram1;
		 System.out.println("Productdetails;"+Product_Details2);
		 
		 //Tv
		 
		 String Brandname="MI";
		 String Model2="vm97";
		 int cost1=598765;
		String size ="140 inch";
		 String Specification = "Black with white+usb,internet,multimedia support";
		 
		
		 String TV=Brandname+Model2+cost1+size+Specification;
		 System.out.println("Productdetails;"+TV);
	}

}
