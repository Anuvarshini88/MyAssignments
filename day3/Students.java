package week2.day3;

public class Students {

	public void getStudentInfo(int id ){

		System.out.println("Id of the student is: " + id);

	}


	public void getStudentInfo(int id, String name) {

		System.out.println("Id of the student is:" + id);
		System.out.println("name of the student is: " + name);




	}

	public void getStudentInfo(String email, float phoneNumber) {
		System.out.println("Email of the student is: "+ email);
		System.out.println("Phone number of the student is: "+ phoneNumber);



	}
	public static void main(String[] args) {
		Students s = new Students();

		s.getStudentInfo(2);
		s.getStudentInfo(2, "Anu");
		s.getStudentInfo("Anu@gmail.com", 99562314585f);

	}

}
