package week2.assignment;

public class Students {

	
		// TODO Auto-generated method stub
public void getStudentInfo(int id ) {
	System.out.println(id);
}
public void getStudentInfo(int id ,String name) {
System.out.println("studentid and Name is:"+id+" "+name );
}
	public void getStudentInfo(String email,int phonenumber) {
		System.out.println("email id and phonenumber is "+email+" "+phonenumber );

	}
	
	public static void main(String[] args) {
Students s=new Students();
s.getStudentInfo(12345);
s.getStudentInfo(12345, "seetha");
s.getStudentInfo("seethaloganathan7@gmail.com", 956778366);
}
}