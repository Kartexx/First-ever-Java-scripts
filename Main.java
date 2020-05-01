package com.company;

public class Main {

     public static void main(String[] args) {
         System.out.println(blubb("+", 2, 2 ));
     }

     public static int blubb(String Operator, int num1, int num2){
         if(Operator == "+"){
             return num1 + num2;
         }
         else if(Operator == "-"){
             return num1 - num2;
         }
         else if(Operator == "*"){
             return num1 * num2;
         }
         else if(Operator == "/"){
             return num1 / num2;
         }
         else{
             return 404;
         }
     }
}