package com.miscellaneous_exercises.easy;

import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int sum = sunArr(arr);
        System.out.println("The summation of arrays is :"+ sum);
    }

    static int sunArr(int[] arr){

        int sunArr = 0;
        for(int i = 0; i < arr.length; i++){

            sunArr += arr[i];
        }
        return sunArr;
    }
}
