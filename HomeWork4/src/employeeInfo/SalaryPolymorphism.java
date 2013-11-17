package employeeInfo;

public class SalaryPolymorphism {

	int f = 500; // Global variable
	
		public void salary(int a){
			System.out.println("Salary for Software Tester is: "+a);
			}
		
		public void salary(int a,int b){
			int c = (a+b);
			System.out.println("Salary for Software Developer is: "+c);
			}
		
		public void salary(int a,int b,int c){
			int g = (((a+b)*c)/f);
				System.out.println("Salary for Manager is :"+g);
				}	
}
