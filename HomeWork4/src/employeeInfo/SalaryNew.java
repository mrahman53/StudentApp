package employeeInfo;

public class SalaryNew extends SalaryPolymorphism {
	int d = 300;
	
	public void salary(int a,int b, int c){
		int e = (((a+b)*c)*d);
		System.out.println("Salary for CEO is: "+e);
		}

}
