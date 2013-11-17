package employeeInfo;

public class Loop {
	
	
	public void forloop(){
		
		for (int salary = 5000; salary <= 10000; salary = salary+5000)
		{
			System.out.println("Salary for Software Departmen: " + salary);
		}
	}

	
	public void froWhile() {
		int salary = 10000;

	      while( salary <10003) {
	    	  System.out.println("Salary for Manager: " + salary);
	         salary++;
	      }
	      
	}

	public  void doWhile() {
		int salary = 20000;

	      do{
	         System.out.println("Salary for CEO: " + salary);
	         salary++;
	      }while( salary <=20002);
	

	}


}

