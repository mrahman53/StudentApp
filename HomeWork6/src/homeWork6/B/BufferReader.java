package homeWork6.B;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class BufferReader{
 
	public static void main(String[] args) {
 
		BufferedReader buffer = null;
 
		try {
 
			String file;
 
			buffer = new BufferedReader(new FileReader("/Users/MdKhan/Desktop/HomeWork6.txt"));
 
			while ((file = buffer.readLine()) != null) {
				System.out.println(file);
			}
 
		} catch (Exception e) {
			System.out.println("There is no file in this path");
		} finally {
			try {
				buffer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
 
	}
}