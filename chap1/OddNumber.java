//Sum of odd numbers from 1 to 100 Pre TWU Exercise
class OddNumber {
	public static void main(String [] args) {

		int i;

		 System.out.println("Print the sum of all odd numbers from 1 to 100");
	
			for(i = 1; i <= 100; i++) {

				if(i % 2 != 0)// between 1 to 100
				{
					System.out.println(i);// print odd values between 1 to 100
				}
			}
	}
}