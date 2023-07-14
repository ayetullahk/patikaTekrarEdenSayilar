package org.example;
import java.util.Arrays;

public class Main {
    static boolean isFound(int[] arr, int value){
        for (int element : arr){
            if (element == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 3, 2, 5, 2, 4, 8, 6, 4, 6, 8, 10, 9, 9, 10, 3};
        int[] evenNumbers = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if (list[i] == list[j]){
                    if (list[i] % 2 == 0){
                        if (!isFound(evenNumbers, list[i])){
                            evenNumbers[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }

        for (int value : evenNumbers){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}