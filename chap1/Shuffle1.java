//Shuffle Exercise Chapter 1 - Headfirst Java
class Shuffle1 {
	public static void main(String [] args) {
	
		int x = 3;
	
		while (x > 0) {

			if (x > 2) {
				System.out.print ("a");
			} //end if	

			x = x - 1;
				System.out.print ("-");

			if (x == 2) {
				System.out.print("b c");

			} //end if

			if (x == 1) {
				System.out.print ("d");
				x = x - 1;

			} //end if
		} //end while
	} //end statements
} //end class