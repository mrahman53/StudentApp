package employeeInfo;

public class EmployeeInfo {

	public static void main(String[] args) {     //This is main methods

		
		
		
		
		//  Getters and Setters methods use here
		
		System.out.println("Getters and Setters methods use here");
		System.out.println("-----------------");
		
		GettersAndSetters classA = new GettersAndSetters();
		
		classA.setEmployeeId(10001);
		classA.setEmployeeSsn(123456789);
		
		System.out.println("Employee ID is :"+classA.getEmployeeId());
		
		System.out.println("Employee SSN is :"+classA.getEmployeeSsn());
		
		
		// Inheritance  class
		System.out.println("-----------------");
		System.out.println("Inheritance  class use here");
		System.out.println("-----------------");
		EmployeeName emp = new EmployeeName();
		emp.companyName();
		emp.departmentsName();
		emp.employeeName();
		
		
		
		// Polymorphism salary calculator
		System.out.println("-----------------");
		System.out.println("Polymorphism salary calculator use here");
		System.out.println("-----------------");
		SalaryPolymorphism sal = new SalaryPolymorphism();
		
		sal.salary(50000);
		sal.salary(50000, 5000);
		sal.salary(50000, 3000, 4000);
		
		SalaryNew salNew = new SalaryNew();
		salNew.salary(50000,500,700);
	
		
		
		// Two interfaces one abstract class  and one concrete class  implement here
		System.out.println("-----------------");
		System.out.println("Two interfaces one abstract class one concrete class implement here");
		System.out.println("-----------------");
		AddressAndTitle addTit = new AddressAndTitle(); 
		
		addTit.jobTitle();
		addTit.department();
		addTit.commission();
		addTit.address();
		addTit.cityName();
		addTit.countryNname();
		
		// Static and nonstatic variable
		System.out.println("-----------------");
		System.out.println("Static and nonstatic variable implement here");
		System.out.println("-----------------");
		 
		VacationDay va = new VacationDay();
		
		VacationDay.softwareTester(); // Static way access
		VacationDay.softwareDevoloper();
		VacationDay.manager();
		va.ceo(); // Non-static way access
		
		
		
		// Loop implement here
	    System.out.println("-----------------");
		System.out.println("Loop implement here");
		System.out.println("-----------------");
		Loop count = new Loop();
		count.forloop();
		count.froWhile();
		count.doWhile();
		
	}

}

