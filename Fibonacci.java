
/*fibonacci
 f(0)=1
 f(1) = 1
 f(n) = f(n-1)+f(n-2)*/

class Fibonacci {
	 public static int fib(int n) {
	        if (n == 0) {
	            return 1;
	        } else if (n == 1) {
	            return 1;
	        } else {
	            return fib(n - 1) + fib(n - 2);
	        }
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        //for (int i = 0; i < n; i++) {
	            System.out.print(fib(9) + " ");
	        //}
	    }
	}
