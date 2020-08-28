package com.company;

public class TestCalculator {
     public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2,2);
        if(result != 4 ){
            System.out.println("Calc works wrong");
        }
        else {
            System.out.println("Calc works Correct");
        }
    }
}
