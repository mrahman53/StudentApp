package homeWork6.E;


import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList <Object> ();
		
		
		list.add("Mamun");
		list.add("Samim");
		list.add (1234);
		list.add(12.5);
		list.add("A");
		list.add("xyz");
		
		System.out.println(list.size());
		
		for (Object b :list){
			System.out.println(b.toString());
		}
		
	}
}
