import java.util.Scanner;
import java.lang.System;

public class FizzBuzz {

    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a num Number: ");
        int number =scanner.nextInt();
        if (number%3==0 && number%5==0){
        System.out.println("number is FizzBuzz: ");
        }
        else if (number%3==0){
        System.out.println(" you see? it is Buzz: ");
        }
        else if (number%5==0){
        System.out.println(" you see? it is Fizz ");
        }
        else 
        System.out.println(number);
    }
}
