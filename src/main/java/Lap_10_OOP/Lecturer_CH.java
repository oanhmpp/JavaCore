package Lap_10_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer_CH extends Lecturers{
    private double salary;
    private static int hoursInGeneral = 40;

    public Lecturer_CH(String name, String email, String address, int phone, double timeTeach, double salary, int hoursInGeneral) {
        super(name, email, address, phone, timeTeach);
        this.salary = salary;
        hoursInGeneral = hoursInGeneral;
    }

    public Lecturer_CH(double salary, int hoursInGeneral) {
        this.salary = salary;
        hoursInGeneral = hoursInGeneral;
    }

    public Lecturer_CH() {
    }

    public Lecturers enterLecturer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Phone: ");
        int phone = sc.nextInt();
        System.out.println("Time teach: ");
        double timeTeach = sc.nextDouble();
        System.out.println("Salary: ");
        double salary = sc.nextDouble();
        return new Lecturer_CH(name,email,address,phone,timeTeach,salary,hoursInGeneral);
    }

    // sử dụng toString
    public String printListLecturer(ArrayList<Lecturers> list) {
        String re = "Name\t\t\t\t\tEmail\t\t\t\t\tAddress\t\t\t\tPhone\t\t\t\tTime teach\tSalary\t\tHours in general\n";
        return re;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int gethoursInGeneral() {
        return hoursInGeneral;
    }

    public void sethoursInGeneral(int hoursInGeneral) {
        this.hoursInGeneral = hoursInGeneral;
    }
}
