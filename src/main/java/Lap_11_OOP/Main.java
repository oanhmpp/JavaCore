package Lap_11_OOP;

import Lap_10_OOP.Lecturer_CH;
import Lap_10_OOP.Lecturer_TG;
import Lap_10_OOP.Lecturers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> list = new ArrayList<>();
        Figure f = new Rectangular();
//        f.enterFigure(sc);
//        list = f.enterFigure(sc);
        System.out.println(list.size());

        Figure l ;
        /**
         * Nhập thông tin
         * */
        Scanner sc = new Scanner(System.in);
        String number = "";
        list.add(new Square(new Point(3,4),12));
        while (!number.equals(0)){
            System.out.println("***************************************************");
            System.out.println("*****************Please select actions:************************");
            System.out.println("** 1. Enter Circle                                           **");
            System.out.println("** 2. Enter Rectangular                                      **");
            System.out.println("** 3. Enter Square                                           **");
            System.out.println("** 4. Enter Triangle                                         **");
            System.out.println("** 5. Print list Figure                                      **");
            System.out.println("** 6. Print list Circle                                      **");
            System.out.println("** 7. Print list Rectangular                                 **");
            System.out.println("** 8. Print list Square                                      **");
            System.out.println("** 9. Print list Triangle                                    **");
            System.out.println("** 10. Print area of all figure                               **");
            System.out.println("** 11. Find the type of trainer with the highest gross salary.**");
            System.out.println("** 0. Exit                                                   **");
            System.out.println("***************************************************************");
            number  = sc.nextLine();
            switch (number){
                case "0":
                    break;
                case "1":
                    l = new Circle();
                    l = l.enterFigure(sc);
                    list.add(l);
                    break;
                case "2":
                    l = new Rectangular();
                    l = l.enterFigure(sc);
                    list.add(l);
                    break;
                case "3":
                    l = new Square();
                    l = l.enterFigure(sc);
                    list.add(l);
                    break;
                case "4":
                    l = new Triangle();
                    l = l.enterFigure(sc);
                    list.add(l);
                    break;
                case "5":
                    System.out.println(list.toString());
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Please enter again !! Input is not true !!");
                    break;
            }}
    }
}
