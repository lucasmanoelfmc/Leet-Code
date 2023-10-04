//  66. Plus One
//  constraint 1: 1 <= digits.length <= 100 
//  constraint 2: 0 <= digits[i] <= 9
//  constraint 3: digits doesn't contain any leading 0's  
package lc1_easy;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        digits[digits.length-1]++;

        for(int i = digits.length-1; i >= 1; i--){
            if(digits[i] == 10){
                digits[i] = 0;
                digits[i-1]++;
            }
        }

        if(digits[0] == 10){
            int[] copycat = new int[digits.length+1];

            for(int i = 0; i < digits.length; i++){
                copycat[i+1] = digits[i];
            }

            copycat[1] = 0;
            copycat[0] = 1;

            digits = copycat.clone();
        }

        return digits;
    }

    public static void printArray(int[] array){
        System.out.printf("[");
        for(int i = 0; i < array.length; i++){
            if(i < array.length - 1){
                System.out.printf(array[i] + ", ");
            }
            else{
                System.out.printf(array[i] + "]\n");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {9,9};
        printArray(plusOne(arr1));

        int[] arr2 = {1,9,9,9};
        printArray(plusOne(arr2));

        int[] arr3 = {8,9,7};
        printArray(plusOne(arr3));

    }
    
}

