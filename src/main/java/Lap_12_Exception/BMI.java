package Lap_12_Exception;

import java.util.Scanner;

public class BMI {
    double weight;
    double height;

    public String bmi (double weight, double height){
        double bmi = weight/(height*height);
        String re = "";
        try{
            if (bmi < 18) {
                re = "You are skinny!";
            } else if (bmi <= 24.9) {
                re = "You are a normal person";
            } else if (bmi <= 29.9) {
                re = "You are obese grade I";
            } else if (bmi <= 34.9) {
                re = "You are obese grade II";
            } else {
                re = "You are obese grade III";
            }
        }catch (ArithmeticException ex){
            System.out.println("Arithmetic error");
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}
