package array;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] myArray = new String[3];
				
		myArray[0] = "Selenium";
		myArray[1] = "Eclipse";
		myArray[2] = "Java";

		System.out.println(myArray[1]);
		
		for (int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

}
