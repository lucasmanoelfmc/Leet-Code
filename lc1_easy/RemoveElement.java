//  27. Remove Element
package lc1_easy;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        //  in-place, O(n²)

        int contador = 0;

        for(int i = 0; i < nums.length; i++){
            if(val == nums[i]){
                nums[i] = -1;
            }
            else{
                contador++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == -1){
                for(int j = i; j < nums.length; j++){
                    if(nums[j] != -1){
                        nums[i] = nums[j];
                        nums[j] = -1;
                        break;
                    }
                }
            }
        }

        printArray(nums);

        return contador;

    }

    public static int removeElement2(int[] nums, int val){
        //  O(n)

        int i = 0;

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        printArray(nums);

        return i;

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

        int[] array1 = {3,2,2,3,5};
        System.out.println(removeElement(array1, 2));
        System.out.println(removeElement2(array1, 2));
        System.out.println("*********************************");

        int[] array2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(array2, 2));
        System.out.println(removeElement2(array2, 2));
        System.out.println("*********************************");

        int[] array3 = {3,2,2,3};
        System.out.println(removeElement(array3, 3));
        System.out.println(removeElement2(array3, 3));
        System.out.println("*********************************");

    }
    
}