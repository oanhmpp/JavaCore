package Lap_10_OOP;

import java.util.Scanner;

public class Lecturer_TG extends Lecturers{
    private String nameOrgan; // cơ quan làm việc

    public Lecturer_TG(String name, String email, String address, int phone, double timeTeach, String nameOrgan) {
        super(name, email, address, phone, timeTeach);
        this.nameOrgan = nameOrgan;
    }

    public Lecturer_TG(String nameOrgan) {
        this.nameOrgan = nameOrgan;
    }

    public Lecturer_TG() {
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
        System.out.println("Name organ:  ");
        String nameOrgan = sc.nextLine();
        return new Lecturer_TG(name,email,address,phone,timeTeach,nameOrgan);
    }

    public String getNameOrgan() {
        return nameOrgan;
    }

    public void setNameOrgan(String nameOrgan) {
        this.nameOrgan = nameOrgan;
    }
}
