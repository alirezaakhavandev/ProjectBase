package com.postchi;


import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[] numbers = {5,6,28,32,78,1,2,5,6,7,-12};
        System.out.println(Arrays.toString(getEven(numbers)));

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

    static int[] getEven(int[] array){
        int count = 0;
        //gets the amount of even numbers in an array
        for (int i : array){
            if (i % 2 == 0 ){
                count++;
            }
        }

        int counter = 0;

        int[] values = new int[count];
        
        for (int i : array){
            if (i % 2 == 0){
                values[counter] = i;
                counter++;
            }
        }
        return values;
        
    }

}
