//Obs.: solução envolve converter inteiro para String. 
//Desafio: resolver sem usar String. 

class Solution {

    static Solution solution = new Solution();

    public boolean isPalindrome(int x) {
        if(Integer.toString(x).equals(solution.reverseString(Integer.toString(x)))){
            return true;
        }
        else{
            return false;
        }
    }

    public String reverseString(String str){
        char ch;
        String nstr = "";

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        return nstr;
    }

    public void printSolution(int num){
        System.out.println("Numero: " + num);
        System.out.println("Palíndromo: " + solution.isPalindrome(num));
        System.out.println("*************************");
    }


    public static void main(String[] args) {
        
        solution.printSolution(33);
        solution.printSolution(589);
        solution.printSolution(3443);
        solution.printSolution(2337);

    }
    
}