//  1. Two Sum
//  Obs.: solução em O(n²). Desafio: tentar fazer em menos de O(n²).

class TwoSum {
    static TwoSum solution = new TwoSum();

    public int[] twoSum(int[] num, int target){
        int [] answer = new int[2];

        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                if(num[i] + num[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }

    public void printSolution(int[] array, int target){
        int[] sol;
        sol = solution.twoSum(array, target);
        
        System.out.printf("Array: ");
        System.out.printf("[");
        for(int i=0; i<array.length; i++){
            if(i < array.length - 1){
                System.out.printf(array[i] + ", ");
            }
            else{
                System.out.printf(array[i] + "]");
            }
        }

        System.out.println("\nTarget: " + target);
        System.out.println("Solution: [" + sol[0] + ", " + sol[1] + "]");
        System.out.println("**********************");
    }

    public static void main(String[] args) {

        int[] array1 = {2, 11, 15, 7};
        solution.printSolution(array1, 9);

        int[] array2 = {3, 4, 5, 7};
        solution.printSolution(array2, 9);

        int[] array3 = {3, 3};
        solution.printSolution(array3, 6);

        int[] array4 = {3, 2, 3};
        solution.printSolution(array4, 6);

        int[] array5 = {2, 4, 6};
        solution.printSolution(array5, 7);

    }

}