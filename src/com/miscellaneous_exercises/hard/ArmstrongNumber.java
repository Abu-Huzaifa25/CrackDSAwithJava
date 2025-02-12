package com.miscellaneous_exercises.hard;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arm = in.nextInt();
        if (isArmstrong(arm)){
            System.out.println(arm +" is an Armstrong number");
        }else {
            System.out.println(arm +" is not an Armstrong number.");
        }

    }


    static boolean isArmstrong(int num){

        int original = num;
        int sum = 0;

        String lengthArm = String.valueOf(num);
        int lenlengthArm = String.valueOf(num).length();

        while(num > 0){
            int rem = num % 10; // get -> mode
            num /= 10;
            sum += Math.pow(rem, lenlengthArm);
        }
        return original == sum;



    }
}
