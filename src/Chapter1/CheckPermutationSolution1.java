package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutationSolution1 {
    public static void main(String[] args) {
        boolean result = false;
        System.out.println("Enter String 1 to check whether it contains unique chars or not...");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.println("Enter String 1 to check whether it contains unique chars or not...");
        String input2 = scanner.nextLine();
        if(input1.length() == input2.length()){
            result = isPermutation(input1,input2);
        }

        System.out.println("Result : " + result);

    }
    public static boolean isPermutation(String str1 , String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}
