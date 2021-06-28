import java.util.Scanner;
import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {

         here is Lab 01 solution :
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String myWord = Input.nextLine();
        System.out.println("Enter a number: ");
        int myNumber = Input.nextInt();
        System.out.println("I own " + myNumber+" "+ Pluralize(myWord , myNumber));

        System.out.println("Enter number of heads: ");
        int headsNum = Input.nextInt();
        flipNHeads(headsNum );

        clock();


        // lab 02 solution :

        System.out.println(Arrays.toString(roll(3)));
        containsDuplicates();
        int[] x= {1,2,3,4};
        System.out.println(averageOfArray(x));
        System.out.println(Arrays.toString(averageOfNestedArrays ()));
    }


    // 1. function of pluralize the words :
//
    public static String Pluralize(String word, int n) {
        if ( n == 0 || n > 1) {
            return word + "s";
        } else{
            return word;
        }
    }


    // 2. fuction of the heads and tails
//
    public static void flipNHeads(int n){
        Random rand = new Random();
        int counter = 0;
        int heads = 0;
        boolean condition = true;
        while(heads != n){
            float float_random=rand.nextFloat();
            counter++;
            if(float_random < 0.5){
                System.out.println("tails");
                heads = 0;
            }else{
                System.out.println("heads");
                heads++;
            }
        }
        System.out.println("It took "+ counter+" flips to flip "+ n +" in a row.");
    }


// 3. fuction of printing the clock each second :

public static void clock (){
    int x= 0 ;
int second;
    while(true){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        second= now.getSecond();
        if ( x != second)
        {
        System.out.println(time);
        x=second;}
    }

}


    // lab 02 solution :

    //1. rolling a dice

    public static int[] roll(int n) {
        Random random = new Random();
//        int rand = 0;
        int[] newArr = new int[n];
        int max = 0;
        int min = 7;
        for (int i = 0; i < n; i++) {
            int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
            newArr[i] = rand;
//            if(rand !=0) break;
        }

        return (newArr);


    }


    // 2. contains Duplicates function test:

    public static boolean containsDuplicates() {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        boolean test = false;
//    int testArr[]= new int[arr.length];
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        test = true;
                    } else {
                        test = false;
                    }

                }
            }

        }
        System.out.println(test);
        return test;

    }

    // 3. calculating the average of array elements :
    public static int averageOfArray (int[] arr)
    {
        int avg=0 ;
        for (int i =0 ; i<arr.length;i++)
        {
            avg= avg+arr[i];
        }
        return avg/arr.length;
    }


    // 4. calculating the Average of array of arrays:
    public static int[] averageOfNestedArrays ()
    {
        // Daily average temperatures for Seattle, October 1-28 2017
        int avg=0;
        int x =0;
        int lowest=0;
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        for ( int i=0 ; i< weeklyMonthTemperatures.length;i++)
        {

            avg=0;
            for (int el:weeklyMonthTemperatures[i])
            {
                avg+= el;
                lowest=avg;

                if (lowest>avg)
                {
                    lowest=avg;
                    x=i;
                }
            }
        }

        return weeklyMonthTemperatures[x];
    }


}

