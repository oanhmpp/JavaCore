package Lab_9;

import java.util.Scanner;

public class Coordinates {
    private double x;
    private double y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates() {

    }

    /**
     * Nhập/Xuất tọa độ điểm
     */
    public void print() {
        System.out.println("A(x,y)= " + x + "," + y);
    }

    /**
     * Tính khoảng cách giữa hai điểm
     */
    public double distance(Coordinates a, Coordinates b) {
        double result = Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
        return (double) Math.round(result * 100) / 100;
    }

    /**
     * Tìm điểm đối xứng qua gốc toạ độ/trục Ox/Oy
     */
    public Coordinates symmetryPoint(Coordinates a) {
        a.x *= (-1);
        a.y *= (-1);
        return a;
    }

    /**
     * Kiểm tra điểm thuộc phần tư nào?
     */
    public String belongOxy(Coordinates a) {
        if (a.x > 0 && a.y > 0) {
            return "Point a belongs to the top right origin !";
        } else if (a.x < 0 && a.y > 0) {
            return "Point a belongs to the top left origin !";
        } else if (a.x > 0 && a.y < 0) {
            return "Point a belongs to the bottom right origin !";
        } else {
            return "Point a belongs to the bottom left origin !";
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("***Please enter coordinates***");
//        System.out.println("x: ");
//        double x = sc.nextDouble();
//        System.out.println("y: ");
//        double y = sc.nextDouble();
//        Coordinates c = new Coordinates(x, y);
//        c.print();
        Coordinates c2 = new Coordinates();
        System.out.print("Distance A and B: ");
        System.out.println(c2.distance(new Coordinates(1.5, -3.4), new Coordinates(4, 5)));
        System.out.print("Symmetry Point A(x,y): ");
        Coordinates c3 = c2.symmetryPoint(new Coordinates(-4, 5));
        System.out.println("(" + c3.x + "," + c3.y + ")");
        System.out.print("Find position: ");
        System.out.println(c2.belongOxy(c3));
    }
}
