package week1.day2;

public class SwitchBrowser {

	public static void main(String[] args) {

		String browser = "IE";

		switch (browser) {

		case "Edge":
			System.out.println("Launch edge browser");
			break;

		case "Firefox":
			System.out.println("Launch firefox browser");
			break;

		case "Chrome":
			System.out.println("Launch Chrome browser");
			break;

		case "Safari":
			System.out.println("Launch Safari browser");
			break;

		default: 
			System.out.println("Launch default browser");

		}


		System.out.println("This is the cross browser testing");



	}

}
