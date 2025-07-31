package com.example;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
public class Calculator {
    String calculation;
        public String getCalculation() {
            return calculation;
        }
        
        public void setCalculation(String calculation) {
            this.calculation = calculation;
        }

        public void translateCalculation(String inputedCalc) {
            Expression e = new ExpressionBuilder(inputedCalc).build();
            double result = e.evaluate();
            System.out.println("Result: " + result);
        }
}
