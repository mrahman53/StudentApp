package homeWork6.A;
import java.util.Scanner;

public class GradeCalculatorIfElse {

	public static void main(String[] args) {
		
		System.out.println("Please enter five number for Grade Calculate: ");
	
		int gradeInput[] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		
		for (int x = 0;x<gradeInput.length;x++ ){
			gradeInput[x] = sc.nextInt();
		}
		
		for (int i = 0; i < gradeInput.length; i++){
			System.out.println(gradeInput[i]);
		} 
		
		
		if (gradeInput[0]<59){
			System.out.println("You dont have any grade !!!!!!!!");
		}else {
			System.out.println("Your grade is C and  poor!!");
		}
		if (gradeInput[1]<60){
			System.out.println("You dont have any grade !!!!!!!!");
		}else {
			System.out.println("Your grade is B  improve yourself");
		}
		if (gradeInput[2]<70){
			System.out.println("You dont have any grade !!!!!!!!");
		}else {
			System.out.println("Your grade is B+ ");
		}if (gradeInput[3]<80){
			System.out.println("You dont have any grade !!!!!!!!");
		}else {
			System.out.println("Your grade is  A very good!!");
		}if (gradeInput[4]<90){
			System.out.println("You dont have any grade !!!!!!!!");
		}else {
			System.out.println("Your grade is A+  Excellent!!!!");
		}
	}

}
