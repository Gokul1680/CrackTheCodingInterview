package Chapter1;

import java.util.Scanner;

public class CheckPermutationSolution2 {

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
        int[] arr = new int[128];
        for(int i = 0 ; i < str1.length() ; i++){
            arr[str1.charAt(i)] += 1;
            arr[str2.charAt(i)] -= 1;
        }
        for(int i : arr){
            if(i > 0){
                return false;
            }

        }
         return true;
    }

}
