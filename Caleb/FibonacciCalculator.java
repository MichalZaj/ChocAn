public class FibonacciCalculator {
	
	public int calculateFibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return calculateFibonacci(n-1) + calculateFibonacci(n-2);
	}
}


public class HelloWorld() {
	public static void main(String args[]) {
		calculator = new FibonacciCalculator();
		int fib5 = calculator.calculateFibonacci(5);
		System.out.println("Fib(5) is "+fib5);
	}
}