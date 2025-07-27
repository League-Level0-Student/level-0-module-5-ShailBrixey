package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String Input = JOptionPane.showInputDialog("Enter a number.");
		int input = Integer.parseInt(Input);
		for(int i = 2; i < input; i++) {
			if(input % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is NOT prime.");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your number is prime.");
	}

}
