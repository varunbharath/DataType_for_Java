package thiskeyword;

public class ThisKeyword {
	
	
	
	
    void Annauniversity(String BestDepart,String College, String district,int noofstudent) {
    	
    
    System.out.println("Annauniversity details:"+BestDepart+College+district+noofstudent);
    int since=1880;
    String city="chennai";
    String details=since+city;
    System.out.println("details"+details);
    	System.out.println("Annauniversitydetails"+BestDepart+College+district+noofstudent);
    	this.SRM();
    }
    
    void SRM() {
    	int students=234567;
    	String Dept="ECE";
    	String Stafs="1200";
    	String Srmdetails=students+Dept+Stafs;
    	System.out.println("SRM UNIVERSITY DETAILS:"+Srmdetails);
    	//this.Annauniversity(Dept, Stafs, Srmdetails, students);
    	
    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeyword obj=new ThisKeyword();
		obj.Annauniversity("Ece", "psg", "cbe", 455);
		//obj.SRM();

	}

}
