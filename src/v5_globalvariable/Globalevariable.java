package v5_globalvariable;

public class Globalevariable {
	
	int Numbers_of_electronics =345766;
	int packeditems=45757;
	int unpackeditems=123789;
	int damageites=567877;
	String Brand="Dell";
	int a=34567;
	int b=45678;
	int c=76548;
	int d=456;
	String VAMID="VAM001";
    String VAMVP= "DK";
    String Started ="2000";
    int No_of_EMP=34500;
	void Branddetails() {
		String brandDetais=Numbers_of_electronics+packeditems+unpackeditems+damageites+Brand;
		System.out.println("Dell brand Details:"+brandDetais);
	}

	void Addition() {
		int additton1 =a+b+c+d;
		System.out.println("Dell brand Details:"+additton1);
	}
 void  DetailsofVAM() {
	 String VAMDetails=VAMID+VAMVP+Started+No_of_EMP;
	 System.out.println("output:"+VAMDetails);
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Globalevariable obj=new Globalevariable();
		
       obj.Branddetails();
       obj.Addition();
	}

}
