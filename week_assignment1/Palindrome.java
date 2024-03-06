package week_assignment1;

public class Palindrome {
	public static void main(String[] args) {
		int number=121,i,temp,rem;
		temp=number;
		for (i = 0; number> 0;number/=10) {
			rem=number%10;
			i=(i*10)+rem;
			
		}
		if (temp==i) {
			System.out.println(temp+" is a Palindrome");
			
		} else {
			System.out.println(temp+ " is not a Palindrome");

		}
			
	}

}
