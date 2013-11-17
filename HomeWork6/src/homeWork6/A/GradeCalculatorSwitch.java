package homeWork6.A;

import java.util.Scanner;

public class GradeCalculatorSwitch {

	public static void main(String[] args) {
		
		
		System.out.println("Please Enter character  from A-C for Grade Calculate: ");
		
		char gradeInput;
		Scanner src = new Scanner(System.in);
		gradeInput = src.next().charAt(0);
		 
		
		
		switch (gradeInput){
		  case 'A':
		    case 'a':
		        System.out.println("Grade A start from 89 to 100");
		        break;
		    case 'B':
		    case 'b':
		    	System.out.println("Grade B start from 79 to 90");
		        break;
		    case 'C':
		    case 'c':
		    	System.out.println("Grade C start from 69 to 80");
		        break;
		    
		    
		    default:
		    	System.out.println("No Grade for you");
		        break;
		}
		
		
	}

}
