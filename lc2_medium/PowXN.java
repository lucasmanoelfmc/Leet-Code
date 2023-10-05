//  50. Pow(x, n)
//  constraint 1: -100 < x < 100
//  constraint 2: -2^31 <= n <= 2^31
//  constraint 3: n is an integer
//  constraint 4: either x is not zero or n > 0
//  constraint 5: -10^4 <= x^n <= 10^4 
package lc2_medium;

public class PowXN {

    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        double a;
        int b;
        
        a = 3;
        b = 3;
        System.out.println("(" + a + ")" + "^" + b + ": " + myPow(a, b));
        
        a = 2;
        b = 2;
        System.out.println("(" + a + ")" + "^" + b + ": " + myPow(a, b));

        a = 9;
        b = 2;
        System.out.println("(" + a + ")" + "^" + b + ": " + myPow(a, b));
    }

    
}
