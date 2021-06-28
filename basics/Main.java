import java.util.Scanner;
import java.util.Random;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;




public class Main {
    public static void main(String[] args) {
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

    }
    public static String Pluralize(String word, int n) {
        if ( n == 0 || n > 1) {
            return word + "s";
        } else{
            return word;
        }
    }

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

//
//    public static void clock(){
//
////        long start = System.currentTimeMillis();
////        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
//
//        //Create formatter
//        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("HH:mm:ss a");
//
////Local time instance
//        LocalTime localTime = LocalTime.now();
//
////Get formatted String
//        String localTimeString = FOMATTER.format(localTime);
//
//
//        while (ture)
//        {
//
//            System.out.println( "the time now is : ",localTimeString);
//            Thread.sleep(1000);
//        }
//
//    }




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




}

