//  168. Excel Sheet Column Title
package lc1_easy;

class ExcelSheet{

    public static String convertToTitle(int columnNumber) {
        
        String columnTitle = "";
        String catcher = "";
        int resto;
  
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
        "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        while(columnNumber != 0){
            resto = (columnNumber - 1) % 26;
            columnNumber = (columnNumber - 1) / 26;
            catcher += alfabeto[resto];
        }

        for(int i = catcher.length() - 1; i >= 0; i--){
            columnTitle += catcher.charAt(i);
        }

        return columnTitle;
    }

    public static void main(String[] args) {

        System.out.println(convertToTitle(1));      // A
        System.out.println(convertToTitle(10));     // J
        System.out.println(convertToTitle(28));     // AB
        System.out.println(convertToTitle(701));    // ZY    
        System.out.println(convertToTitle(52));     // AZ
        System.out.println(convertToTitle(53));     // BA

    }

}