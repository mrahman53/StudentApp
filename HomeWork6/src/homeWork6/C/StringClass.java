package homeWork6.C;

public class StringClass {

	public static void main(String[] args) {
		
		
		String str = "My country name is Bangladesh";
		String str1 = "I love my country";
		String str2 = "I love my country";
		
		
		
		
		System.out.println("Length of String is : "+str.length());    
		System.out.println("Compare with str and Str1 variable: " + str.equals(str1));
		System.out.println("Compare to another String variable Str2: " +str1.equals(str2));
		System.out.println("Change all charter to lower case:" +str.toLowerCase());
		System.out.println("Change all charter to Upper case:"+ str2.toUpperCase());
		System.out.println("finding Charactern 19 on this variavle: " +str.charAt(19));
		System.out.println("Copy the declare variable character:" +str2.trim());
		System.out.println("Concatenation with another variable:" + str.concat(str2));
		System.out.println("It will print position of n in str variable: "+str.indexOf('n'));
		System.out.println("It will print position of n second time on str variable: "+str.indexOf("n", 9));
		System.out.println("Loking same variable is present or not:" +str2.indexOf("I love my country"));
		System.out.println("Loking name is present or not:" +str2.indexOf("name"));
		System.out.println(str2.isEmpty());
		System.out.println(str.getBytes());
		System.out.println(str.equalsIgnoreCase(str1));
		
	

		
		
		

	}

}
