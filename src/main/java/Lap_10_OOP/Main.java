package Lap_10_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Tạo danh sách giáo viên có sẵn
         */
        ArrayList<Lecturers> listLec = new ArrayList<>();
        listLec.add(new Lecturer_CH("Nguyễn Oanh 1","Oanhmpp@gmail.com","HCM",0763455060,50,120000,40));
        listLec.add(new Lecturer_CH("Nguyễn Oanh 2","Oanhmpp22@gmail.com","HCM",0763455060,50,120000,40));
        listLec.add(new Lecturer_TG("Nguyễn Oanh 2","Oanhmpp22@gmail.com","HCM",0763455060,30,"Trường tiểu học"));

        /**
         * Nhập thông tin
         * */
        Scanner sc = new Scanner(System.in);
        Lecturers l = new Lecturers();
        String number = "";
        while (!number.equals(0)){
            System.out.println("***************************************************");
            System.out.println("*****************Please select actions:************************");
            System.out.println("** 1. Enter Lecturer CH                                      **");
            System.out.println("** 2. Enter Lecturer TG                                      **");
            System.out.println("** 3. Print list lecturer                                    **");
            System.out.println("** 4. Print list lecturer CH                                 **");
            System.out.println("** 5. Print list lecturer TG                                 **");
            System.out.println("** 6. Print salary of all lecturer                           **");
            System.out.println("** 7. Find the type of trainer with the highest gross salary.**");
            System.out.println("** 0. Exit                                                   **");
            System.out.println("***************************************************************");
            number  = sc.nextLine();
            switch (number){
            case "0":
                break;
            case "1":
                l = new Lecturer_CH();
                l = l.enterLecturer();
                listLec.add(l);
                break;
            case "2":
                l = new Lecturer_TG();
                l = l.enterLecturer();
                listLec.add(l);
                break;
            case "3":
                System.out.println(l.printListLecturer(listLec));
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                System.out.println("Please enter again !! Input is not true !!");
                break;
        }}
    }

}
