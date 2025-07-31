package com.example;


import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
        
        Calculator calc;
        calc = new Calculator();

        boolean I = true;

        Scanner Scanner = new Scanner(System.in);

        while (I = true) {

            System.out.println("Enter your calculation");
            String inputtedCalc = Scanner.nextLine();
        
            calc.translateCalculation(inputtedCalc);

            
            
            System.out.println("Continue? y/n");
            String proceed = Scanner.nextLine();
            
            if (proceed == "y" || proceed == "Y") {
                continue;
            } else if (proceed == "n" || proceed == "N") {
                I = false;
            } 
            else if (proceed != "y" || proceed != "Y") {
                continue;
            }
        }
        Scanner.close();
    }
}