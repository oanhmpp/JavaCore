package Lab_1;

import java.util.Calendar;

public class BaiThucHanh_1 {
    // b4 tinh tuoi dua vao nam sinh
    public String ageCurrent(int yearBirth){
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age =  yearCurrent-yearBirth;
        return "Your age: "+age;
    }

    // b5 tinh tong hieu tinh thuong
    public String calculator(int a,int b){

        if(b < 0 ){
            System.out.println("The second number must greater than 0");
        }

        int sum = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int surplus = a%b;
        return "Sum: "+ sum + "\nSubtraction: " + subtraction + "\nMultiplication: "+ multiplication
                            + "\nDivision: " + division + "\nDivision: "+division + ", surplus:" + surplus;
    }

    // b6 tien = sl*gia thue = 10% tien
    public String product(String name,int amount, double price){
        double salary = amount*price;
        double tax = 0.1*salary;
        return "Salary: "+ salary+"\nTax: "+ tax;
    }

    //b7 tinh diem trung binh
    public String average (double math, double physical, double chemistry){
        double result = (math+physical+chemistry)/3;
        return "The average: "+ result;
    }

    //b8 tinh chu vi - dien tich
    public String circle(double radius){
            double area = Math.round((radius*radius*Math.PI)*100.0)/100.0;
            double perimeter = Math.round((2*radius*Math.PI)*100.0)/100.0;
            return "Area: "+ area+"\nPerimeter: "+ perimeter;
    }

    // b9 ban so xe
    public String carNumber(String number){

        String[] arr = number.split("");
        int result = 0;
        if(arr.length>4){
            try{
            for(int i = 0;i < arr.length-1;i++){
                result = (Integer.parseInt(arr[i]) + result)%10;
                i++;
            }}catch (Exception e){
                System.out.println("You must enter number");
            }
            return "The result: "+result;
        }else {
            return "Error";
        }
    }

    // b10 tim max min
    public String findNumber(int a,int b){
        if(a>b){
            return "Max: "+a+" - Min: "+b;
        }else if(a==b ){
            return "Can't find max and min";
        }else if(a<b) {
            return "Min: "+a+" - Max: "+b;
        } else {
            return "Error";
        }
    }
    public static void main(String[] args) {
        BaiThucHanh_1 b = new BaiThucHanh_1();
        System.out.println("---------Exercise 4---------");
        System.out.println(b.ageCurrent(1999));
        System.out.println("---------Exercise 5---------");
        System.out.println(b.calculator(2,4));
        System.out.println("---------Exercise 6---------");
        System.out.println(b.product("Clothing",12,100.0));
        System.out.println("---------Exercise 7---------");
        System.out.println(b.average(10.0,9.0,8.0));
        System.out.println("---------Exercise 8---------");
        System.out.println(b.circle(12.2));
        System.out.println("---------Exercise 9---------");
        System.out.println(b.carNumber("12344"));
        System.out.println("---------Exercise 10---------");
        System.out.println(b.findNumber(5,6));
    }

}
