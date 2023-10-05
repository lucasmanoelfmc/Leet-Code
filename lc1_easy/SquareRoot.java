//  69. Sqrt(x)
package lc1_easy;

public class SquareRoot {

    public static int mySqrt(int x) {

        if(x == 0 || x == 1){
            return x;
        }
        
        long left = 0;
        long right = x/2;
        long result = 0;

        while (left <= right) {

            long mid = left + ((right - left) / 2); 

            if(mid*mid > x){
                right = mid - 1;
            }
            else if(mid*mid < x){
                left = mid + 1;
                result = mid; // maior valor médio que é menor do que x
            }
            else{
                return (int) mid;
            }

        }

        return (int) result;

    }

    public static void main(String[] args) {
        
        System.out.println("Sqrt(4): " + mySqrt(4));
        System.out.println("Sqrt(9): " + mySqrt(9));
        System.out.println("Sqrt(2): " + mySqrt(2));
        System.out.println("Sqrt(8): " + mySqrt(8));
        System.out.println("Sqrt(0): " + mySqrt(0));
        System.out.println("Sqrt(1): " + mySqrt(1));
        System.out.println("Sqrt(2147483647): " + mySqrt(2147483647));    //TLE
        //  Em Java, o tipo int consegue apenas armazenar números de 
        //  -2.147.483.647 a +2.147.483.647
        //  Portanto é necessário usar o tipo long, que armazena números de 
        // -9.223.372.036.854.775.808 a +9.223.372.036.854.775.808
        System.out.println("Sqrt(35): " + mySqrt(35));
        System.out.println("Sqrt(19): " + mySqrt(19));
        System.out.println("Sqrt(1000): " + mySqrt(1000));

    }

}