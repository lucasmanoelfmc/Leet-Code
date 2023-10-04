//  189. Rotate Array

package lc2_medium;

class RotateArray {

    public static void rotate(int[] nums, int k){
        
        k %= nums.length;
        int[] catcherStart = new int[nums.length - k];
        int[] catcherEnd = new int[k];

        for(int i = 0; i < catcherStart.length; i++){
            catcherStart[i] = nums[i];
        }
        
        for(int i = 0; i < catcherEnd.length; i++){
            catcherEnd[i] = nums[i + catcherStart.length];
        }
        
        for(int i = 0; i < catcherEnd.length; i++){
            nums[i] = catcherEnd[i];
        }
        
        for(int i = 0; i < catcherStart.length; i++){
            nums[i + catcherEnd.length] = catcherStart[i];
        }
        
    }
        
    public static void main(String[] args) {

        int[] arr4 = {1, 2, 3, 4, 5};
        rotate(arr4, 499);

    }
   
}