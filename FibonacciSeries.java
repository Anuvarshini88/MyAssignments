package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum =0, secnum=1, sum, range = 10;

		System.out.println(firstnum + "-> the firstnum is");
		System.out.println(secnum + " -> the secnum is");
		for(int i = 1;i<=8;i++) {

			sum = firstnum+secnum;
			firstnum = secnum;
			secnum =  sum;
			System.out.println(sum);
		}

	}

}
