package homeWork6.E;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList <String> division = new ArrayList <String>();
		
		
		division.add("Dhaka");
		division.add("Barisal");
		division.add("Chittagong");
		division.add("Khulna");
		division.add("Rajshahi");
		division.add("Rangpur");
		division.add("Sylhet");
	
		System.out.println("There are: " + division.size() + " divition in Bangladesh");
		System.out.println("---------------------------------");
		for (int i = 0; i<division.size(); i++){
			System.out.println(division.get(i));
			}
		System.out.println("---------------------------------");
		System.out.println("Add new list on Division");
		division.add(7,	"Bangladesh");
		
		for (int i = 0; i<division.size(); i++){
			System.out.println(division.get(i));
			}
		System.out.println("---------------------------------");
		System.out.println("Replace any data on Division");
			division.set(2, "BARISAL");
			for (int i = 0; i<division.size(); i++){
				System.out.println(division.get(i));
				}
			
		System.out.println("---------------------------------");
		System.out.println("REMOVE any data on Division");
			division.remove(4);
			for (int i = 0; i<division.size(); i++){
				System.out.println(division.get(i));
				}
}
}