package week2.assignment;

public class AxisBank extends bankInfo {
	public void deposit() {
		System.out.println("its axisbank deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank ab=new AxisBank();

ab.deposit();
bankInfo bi=new bankInfo();
bi.deposit();
	}
	

}
