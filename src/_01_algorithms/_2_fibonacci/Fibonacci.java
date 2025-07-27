package _01_algorithms._2_fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		int sum = (number1+number2);
		
		System.out.println(number1);
		System.out.println(number2);
		
		for(int i = 1; i < 12; i++) {
			System.out.println(sum);
			if(i%2 == 0) {
				number1 = sum;
			}
			else {
				number2 = sum;
			}
			sum = (number1+number2);
		}
	}

}
