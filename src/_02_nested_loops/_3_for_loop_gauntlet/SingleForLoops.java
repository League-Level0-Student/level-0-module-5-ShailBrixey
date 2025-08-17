package _02_nested_loops._3_for_loop_gauntlet;

public class SingleForLoops {

	public static void main(String[] args) {
		for(int i = 0; i < 101; i++) { // 1.
			System.out.println(i);
		}
		for(int i = 0; i < 101; i++) { // 2.
			System.out.println(100-i);
		}
		for(int i = 0; i < 101; i++) { // 3.
			if(i%2 == 0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		for(int i = 0; i < 101; i++) { // 4.
			if(i%2 == 1) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		for(int i = 0; i < 501; i++) { // 5.
			if(i%2 ==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
			}
		}
		for(int i = 0; i < 778; i++) { // 6.
			if(i%7 == 0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		for(int i = 2009; i < 2026; i++) {
			System.out.println("In "+i+", I turned "+(i-2009)+" years old.");
		}
	}

}
