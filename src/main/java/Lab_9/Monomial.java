package Lab_9;

import java.util.Scanner;

public class Monomial {
    private double a;
    private int xn;

    /**
     * Đơn thức 1 biến với hệ số nguyên dạng ax^n
     */
    public Monomial(double a, int xn) {
        this.a = a;
        this.xn = xn;
    }

    public Monomial() {

    }

    /**
     * Nhập/Xuất đơn thức
     */
    public void print() {
        if (xn == 1) {
            System.out.print(a + "x");
        } else if (xn == 0) {
            System.out.print(a);
        } else {
            if (a == 1)
                System.out.print("x");
            System.out.print(a + "x" + "^" + xn);
        }
    }

    /**
     * Tính tích, thương hai đơn thức
     */
    public Monomial multiplication(Monomial m1, Monomial m2) {
        Monomial result = new Monomial();
        result.a = m1.a * m2.a;
        result.xn = m1.xn + m2.xn;
        return result;
    }

    public Monomial division(Monomial m1, Monomial m2) {
        Monomial result = new Monomial();
        result.a = m1.a / m2.a;
        result.xn = m1.xn - m2.xn;
        return result;
    }

    /**
     * Tính đạo hàm cấp 1 của đơn thức
     */
    public Monomial firstDerivative(Monomial m) {
        m.a *= (m.xn);
        m.xn -= 1;
        return m;
    }

    /**
     * Tính đạo hàm cấp k của đơn thức
     * */
    /**
     * Tính giá trị đơn thức tại x = x0
     */
    public double getValue(double x) {
        return a * (Math.pow(x, xn));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Please enter monomial by format ax^n (a!=0)---");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.println("***");

        Monomial m = new Monomial(a, n);
        System.out.print("The monomial by format ax^n is ");
        m.print();
        System.out.println();
        System.out.println("***");

        Monomial m2 = new Monomial();
        Monomial m3 = new Monomial(4, 2);
        Monomial m4 = m2.multiplication(m, m3);
        System.out.print("Multiplication: (");
        m.print();
        System.out.print(")*(");
        m3.print();
        System.out.print(") = ");
        m4.print();

        System.out.println();
        System.out.println("***");
        Monomial m5 = m2.division(m, m3);
        System.out.print("Division (n1>n2) : (");
        m.print();
        System.out.print(")/(");
        m3.print();
        System.out.print(") = ");
        m5.print();

        System.out.println();
        System.out.println("***");
        Monomial m6 = new Monomial(10, 2);
        System.out.print("First degree derivative of ");
        m6.print();
        System.out.print(": ");
        m2.firstDerivative(m6).print();

        System.out.println();
        System.out.println("***");
        System.out.print("The result of the input value: ");
        System.out.println(m.getValue(2));

    }
}
