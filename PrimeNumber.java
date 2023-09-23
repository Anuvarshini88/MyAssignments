package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=7;
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			flag=false;
		}
		if(flag)
			System.out.println("prime");
		else
			System.out.println("not prime");
}
	
	
}
