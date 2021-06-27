package week2.day1.javaclassroomexercise;

public class Calculator {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
public void sub(int num1,int num2) {
System.out.println(num1-num2);	
}
public void sub(double num1,double num2) {
System.out.println(num1-num2);	
}
public void mul(int num1,int num2) {
	System.out.println(num1*num2);
}
public void mul(int num1,double num2) {
	System.out.println(num1*num2);
}
public void div(int num1,int num2) {
	System.out.println(num1/num2);
	
}
public void div(double num1,int num2) {
	System.out.println(num1/num2);
	
}
public static void main(String[] args) {
	Calculator c=new Calculator();
	c.add(19, 28);
	c.add(1, 2,3);
	c.mul(6, 6.2);
	c.mul(5, 6);
	c.sub(5.5, 3.5);
	c.sub(5, 3);
	c.div(9.1, 5);
	c.div(8, 4);
}

}
