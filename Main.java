package com.example;
import java.io.Console;
import java.util.Scanner;
import java.awt.*;
import java.sql.Array;
import java.util.Date;
import java.time.LocalDate;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double result;
        System.out.println("Enter the first number: ");
        double firstNumber = reader.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNumber = reader.nextDouble();
        reader.nextLine();
        System.out.println("Enter an operator. Available operators: +,-,*,/.");
        String operator = reader.nextLine();

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.println("The result is: " + result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.println("The result is: " + result);
                break;
            case "/":
                result = firstNumber / secondNumber;
                if (secondNumber == 0){
                    System.out.println("Cannot divide a number by zero.");
                }
                else{
                    System.out.println("The result is: " + result);
                }
                break;
            default:
                System.out.println("Please enter an available arithmetic operator");
                break;
        }
    }
}