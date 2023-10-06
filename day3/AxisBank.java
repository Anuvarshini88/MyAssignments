package week2.day3;

public class AxisBank extends BankInfo{
public void deposit() {
		
		System.out.println("deposit Acnt in axis bank class");
		super.deposit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank a = new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
	}

}
