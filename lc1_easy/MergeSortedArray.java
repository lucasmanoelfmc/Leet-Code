//  88. Merge Sorted Array
//  obs.1: answer should be stored in nums1
//  obs.2: nums1.length == m + n
//  obs.3: nums2.length == n 
package lc1_easy;

public class MergeSortedArray {
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeArrays(nums1, nums2);
        quickSort(nums1, 0, nums1.length-1);
    }

    public static void mergeArrays(int[] nums1, int[] nums2){
        for(int i = 0; i < nums2.length; i++){
            nums1[nums1.length-nums2.length+i] = nums2[i];
        }
    }

    public static void quickSort(int[] array, int low, int high){
        if (low < high){
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for(int j = low; j <= high - 1; j++){
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);

        return i+1;
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
        int[] arr1 = {4,5,6,0,0,0,0,0};
        int[] arr2 = {1,2,3,898,989};
        merge(arr1, arr1.length - arr2.length, arr2, arr2.length);

        printArray(arr1);
    }
    
}