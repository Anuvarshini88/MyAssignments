package week2.day3;

public class Desktop extends Computer{

	public void desktopSize(){
		
		System.out.println("Desktop size is 5 inch");
		
	}
	
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();

	//	Computer c = new Computer();
		d.computerModel();
		
	}

}
