package Lap_11_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figure> list = new ArrayList<>();
        Figure f = new Rectangular();
//        f.enterFigure(sc);
        list.add(f.enterFigure(sc));
//        list = f.enterFigure(sc);
        System.out.println(list.size());
    }
}
