//  13. Roman to Integer
//  constraint 1: s is guaranteed to be a valid roman numeral
//  constraint 2: s contains only the characters I, V, X, L, C, D and M
//  constraint 3: s is in range [1, 3999]
//  constraint 4: 1 <= s.length <= 15

class Solution {
    public static int romanToInt(String s) {
        int integer = 0;
        int i = 0;
        String sCopy = " ";
        sCopy += s;
        sCopy += " ";
        //  I before V and X
        //  X before L and C
        //  C before D and M
        while(i < sCopy.length()){
            switch (sCopy.charAt(i)) {

                default:
                    break;

                case 'I':
                    if(sCopy.charAt(i+1) == 'V' || sCopy.charAt(i+1) == 'X'){
                        if(sCopy.charAt(i+1) == 'V'){
                            integer += 4;
                        }
                        else if(sCopy.charAt(i+1) == 'X'){
                            integer += 9;
                        }
                    }
                    else{
                        integer += 1;
                    }
                    break;

                case 'V':
                    if(sCopy.charAt(i-1) == 'I'){
                        integer += 0;
                    }
                    else{
                        integer += 5;
                    }
                    break;

                case 'X':
                    if(sCopy.charAt(i+1) == 'L' || sCopy.charAt(i+1) == 'C'
                    || sCopy.charAt(i-1) == 'I'){
                        if(sCopy.charAt(i+1) == 'L'){
                            integer += 40;
                        }
                        else if (sCopy.charAt(i+1) == 'C'){
                            integer += 90;
                        }
                        else if(sCopy.charAt(i-1) == 'I'){
                            integer += 0;
                        }
                    }
                    else{
                        integer += 10;
                    }
                    break;

                case 'L':
                    if(sCopy.charAt(i-1) == 'X'){
                        integer += 0;
                    }
                    else{
                        integer += 50;
                    }
                    break;

                case 'C':
                    if(sCopy.charAt(i+1) == 'D' || sCopy.charAt(i+1) == 'M'
                    || sCopy.charAt(i-1) == 'X'){
                        if(sCopy.charAt(i+1) == 'D'){
                            integer += 400;
                        }
                        else if(sCopy.charAt(i+1) == 'M'){
                            integer += 900;
                        }
                        else if(sCopy.charAt(i-1) == 'X'){
                            integer += 0;
                        }
                    }
                    else{
                        integer += 100;
                    }
                    break;

                case 'D':
                    if(sCopy.charAt(i-1) == 'C'){
                        integer += 0;
                    }
                    else{
                        integer += 500;
                    }
                    break;

                case 'M':
                    if(sCopy.charAt(i-1) == 'C'){
                        integer += 0;
                    }
                    else{
                        integer += 1000;
                    }
                    break;
            }

            i++;
        }

        return integer;
    }

    public static void main(String[] args) {
        System.out.println("I: " + romanToInt("I")); // 1
        System.out.println("III: " + romanToInt("II")); // 2
        System.out.println("III: " + romanToInt("III")); // 3
        System.out.println("IV: " + romanToInt("IV")); // 4
        System.out.println("V: " + romanToInt("V")); // 5
        System.out.println("VI: " + romanToInt("VI")); // 6
        System.out.println("VII: " + romanToInt("VII")); // 7
        System.out.println("VIII: " + romanToInt("VIII")); // 8
        System.out.println("IX: " + romanToInt("IX")); // 9
        System.out.println("X: " + romanToInt("X")); // 10
        System.out.println("XI: " + romanToInt("XI")); // 11
        System.out.println("XLIX: " + romanToInt("XLIX")); // 49
        System.out.println("LVIII: " + romanToInt("LVIII")); // 58
        System.out.println("LXXVIII: " + romanToInt("LXXVIII")); // 78
        System.out.println("XCIX: " + romanToInt("XCIX")); // 99
        System.out.println("CCCLXXVIII: " + romanToInt("CCCLXXVIII")); // 378
        System.out.println("CDV: " + romanToInt("CDV")); // 405
        System.out.println("CMXCIX: " + romanToInt("CMXCIX")); // 999
        System.out.println("MXIV: " + romanToInt("MXIV")); // 1014
        System.out.println("MCDXCIX: " + romanToInt("MCDXCIX")); // 1499
        System.out.println("MDCCLXXXIX: " + romanToInt("MDCCLXXXIX")); // 1789
        System.out.println("MCMXLIX: " + romanToInt("MCMXLIX")); // 1949
        System.out.println("MCMXCIV: " + romanToInt("MCMXCIV")); // 1994
        System.out.println("MM: " + romanToInt("MM")); // 2000
        System.out.println("MMMCMXCIX: " + romanToInt("MMMCMXCIX")); // 3999
    }

}
