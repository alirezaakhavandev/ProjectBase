package com.postchi;

public class ArrayMaxValue {
  //this is a test main method
    public static void main( String[] args ) {
        int[] num = {4,2,9,12,65,38,1,5,27,9,4,23,65,0};
        System.out.println(maxValue(num));
    }

    static int maxValue(int[] integer){
        int max = integer[0]; // it is set to 4 in this example
        for (int i : integer){ if (i > max) {max = i;}} // loops through the values , if a value is bigger max is set to that value
        return max;
    }
}
