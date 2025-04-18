package com.postchi;


import java.util.Arrays;

public class App {
    public static void main( String[] args ) {
        int[] numbers = {5,6,28,32,78,1,2,5,6,7,-12,33,67,129,321,-451};
        System.out.println("The max value is : " + maxValue(numbers));
        System.out.println("The min value is : " + minValue(numbers));
        System.out.println("The index of Max value is : " + maxIndex(numbers));
        System.out.println("The reverse order is : " + Arrays.toString(reverseOrder(numbers)));
        System.out.println("Even numbers are : " + Arrays.toString(getEven(numbers)));
        System.out.println("Odd numbers are : "  + Arrays.toString(getOdd(numbers)));

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


}
