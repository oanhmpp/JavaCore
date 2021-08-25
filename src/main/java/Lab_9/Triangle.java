package Lab_9;

import java.util.Scanner;

public class Triangle {
    private static int a;
    private static int b;
    private static int c;

    public Triangle() {
    }

    /**
     * Kiểm tra có phải là 1 tam giác không
     */
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c || a + c > b || b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Nhập/Xuất tam giác
     */
    public void print() {
        System.out.println("The lengths of triangle ABC are respectively: \n" + "AB: " + a + "\tAC: " + b + "\tBC: " + c);
    }

    /**
     * Tính chu vi, diện tích tam giác
     */
    public int perimeterOfTriangle() {
        return a + b + c;
    }

    public double areaOfTriangle() {
        double haft = (a+b+c)/2;
        return Math.sqrt(haft*(haft-a)*(haft-b)*(haft-c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("***Please enter information***");
            System.out.println("Edge AB: ");
            a = sc.nextInt();
            System.out.println("Edge AC: ");
            b = sc.nextInt();
            System.out.println("Edge BC: ");
            c = sc.nextInt();
        }
        while (!isTriangle(a, b, c));
        Triangle t = new Triangle();
        t.print();
        System.out.print("Perimeter of triangle: ");
        System.out.println(t.perimeterOfTriangle());
        System.out.print("Area Of Triangle: ");
        System.out.println(t.areaOfTriangle());

    }
}
