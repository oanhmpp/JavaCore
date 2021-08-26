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
        System.out.println("A(x,y)= (" + x + "," + y + ")");
    }

    /**
     * Tính khoảng cách giữa hai điểm
     */
    public double distance(Coordinates b) {
        double result = Math.sqrt(Math.pow((b.x - this.x), 2) + Math.pow((b.y - this.y), 2));
        return (double) Math.round(result * 100) / 100;
    }

    /**
     * Tìm điểm đối xứng qua gốc toạ độ/trục Ox/Oy
     */
    public void symmetryPoint() {
        this.x *= (-1);
        this.y *= (-1);
    }

    /**
     * Kiểm tra điểm thuộc phần tư nào?
     */
    public String belongOxy() {
        if (this.x > 0 && this.y > 0) {
            return "Point a belongs to the top right origin !";
        } else if (this.x < 0 && this.y > 0) {
            return "Point a belongs to the top left origin !";
        } else if (this.x > 0 && this.y < 0) {
            return "Point a belongs to the bottom right origin !";
        } else {
            return "Point a belongs to the bottom left origin !";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Please enter coordinates***");
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        Coordinates c = new Coordinates(x, y);
        c.print();

        System.out.print("Distance A and B: ");
        System.out.println(c.distance(new Coordinates(4, 5)));
        System.out.print("Symmetry Point A(x,y): ");
        c.symmetryPoint();
        c.print();
        System.out.print("Find position: ");
        System.out.println(c.belongOxy());
    }
}
