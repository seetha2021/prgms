package week2.assignment.student;

import week2.assignment.department.Department;

public class Student extends Department {
public void studentName() {
	System.out.println("seetha");
}
public void studentDept() {
	System.out.println("MCA");
}
	public void studentId(){
		System.out.println("631112");
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.studentDept();
		st.studentId();
		st.studentName();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
	}
}

