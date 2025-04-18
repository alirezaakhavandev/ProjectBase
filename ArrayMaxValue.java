package com.postchi;


import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[] numbers = {5,6,28,32,78,1,2,5,6,7,-12,33,67,129,321,-451,2,6};

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
    static int maxIndex(int[] arr){
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
    static int[] getOdd(int[] array){
        // count the even numbers to get the length
        int count = 0 ;
        for (int i : array){
            if (i % 2 != 0){
                count++;
            }
        }
        // create a new array using that length
        int [] oddArray = new int[count];
        // create a counter for the index of the new array to be updated each time it finds a new value for it
        int indexCounter = 0;
        // add values to it
        for (int i : array){
            if (i % 2 != 0){
                oddArray[indexCounter] = i;
                indexCounter++;
            }
        }
        //return array
        return oddArray;
    }
    static int[] uniqueValues(int[] array) {
        int[] unique = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Only check the values before i
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Trim result to the correct length
        int[] result = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result;
    }

}
