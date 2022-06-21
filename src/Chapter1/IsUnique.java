package Chapter1;

import java.util.Scanner;

public class IsUnique {

    public static boolean unique(String str){
        if (str.length() > 128) return false;

        boolean[] charset = new boolean[128];
        for (int i = 0 ; i < str.length() ; i++){
            int val = str.charAt(i);
            if(charset[val]){
                return false;
            }
            charset[val] = true;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter String to check whether it contains unique chars or not...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result = unique(input);
        System.out.println("Result : " + result);

    }
}
