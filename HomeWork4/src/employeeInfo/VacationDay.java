package employeeInfo;

public class VacationDay { // static variable and nonstatic variable
	
	static int a = 10;
	static int b =2;
	int c = 5;
	
	static void softwareTester(){
		int d = (a-b);
		System.out.println("Vacation day for Softwae Tester :" +d);
		
	}
	static void softwareDevoloper(){
		int d = (a+b);
		System.out.println("Vacation day for Softwae devoloper :" +d);
		
	}
	static void manager(){
		int d = (a*b);
		System.out.println("Vacation day for Mamanger :" +d);
}
      public void ceo(){
		int d = ((a*b)+c);
		System.out.println("Vacation day for CEO :" +d);
	}
	
}
