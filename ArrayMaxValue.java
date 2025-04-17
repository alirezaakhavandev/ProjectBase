package com.postchi;


import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[] numbers = {5,6,28,32,78,1,2,5,6,7,-12};
        System.out.println(maxValue(numbers));
        System.out.println(minValue(numbers));
        System.out.println(findTheIndex(numbers));
        System.out.println(Arrays.toString(reverseOrder(numbers)));
    }

    static int maxValue(int[] integer){
        int max = integer[0];
        for (int i : integer){
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    static int minValue(int[] integer){
        int min = integer[0];
        for (int i : integer){
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    static int findTheIndex(int[] arr){
        int i = 0;
        int max = maxValue(arr);
        while (arr[i] != max){
            i++;
        }
        return i;
    }

    static int[] reverseOrder(int[] array){
        int[] reverseTheNumbers = new int[array.length];
        for (int i =0 ; i< array.length ; i++){
            reverseTheNumbers[i] = array[array.length -  1 - i];
        }
        return reverseTheNumbers;
    }
    

}
