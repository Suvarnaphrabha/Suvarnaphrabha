package week_assignment1;

public class IsPrimeNumber {
	public static void main(String[] args) {
		int number=25,count=0;
		for (int i = 0; i <=number ; i++) {
			if (number%1==0) {
				count++;
				
			}
		}
		if (count==2) {
			System.out.println(number+ " is Prime");
			
		} else {
			System.out.println(number+ " is not a Prime");

		}
	}
}
			
		