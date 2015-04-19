//Sum of odd numbers from 1 to 100 Pre TWU Exercise
class SumOddNumber {
	public static void main(String [] args) {

		int i;
		int sum=0;
	
			for(i = 0; i <= 100; i++) {

			if(i % 2 != 0)

			sum+=i;

			}
			System.out.println("Print the sum of all odd numbers from 1 to 100");
			System.out.println("Answer is:"+sum);
	}
}