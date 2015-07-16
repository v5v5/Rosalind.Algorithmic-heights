package _00_FIBO_FibonacciNumbers;

public class Algorithms {

	static public int fibo(int index) {
		
		switch (index) {
		case 0:
			return 0;
		case 1:
			return 1;
		default:
			return fibo(index - 1) + fibo(index - 2);
		}		

	}
	
}
