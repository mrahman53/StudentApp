package student.profie;

public class Profile {
	
	String studentName;
	String studentId;
	String dob;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId( String studentId) {
		this.studentId = studentId;
	}
	public void printStudentInfo(){
	      System.out.println("Student Name  : " + studentName );
	      System.out.println("Student Id    : " + studentId );
	      System.out.println("Student DOB   : " + dob );
	      System.out.println();
	      
	}
}
