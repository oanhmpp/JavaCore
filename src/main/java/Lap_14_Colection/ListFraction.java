package Lap_14_Colection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListFraction {
    private static ArrayList<Fraction> list = new ArrayList<>();

    // nhập danh sách phân số
    public static void enterFraction(Scanner sc) {
        System.out.print("Enter a (numerator): ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter b (denominator): ");
        int b = sc.nextInt();
        sc.nextLine();
        list.add(new Fraction(a, b));
    }

    // in phân số
    public static void printList() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i++ + ". " + list.get(i).getA() + "/" + list.get(i).getB());
        }
    }

    // phân số a có lớn hơn b?
    public static boolean isBigger(Fraction a,Fraction b){
        if (a.getB() == b.getB()) {
            if (a.getA() > b.getA())
                return true;
            else if (a.getA() < b.getA())
                return false;
            return false;
        } else {
            double numA = a.getA() * b.getB();
            double numB = b.getA() * a.getB();
            if (numA > numB)
                return true;
            else if (numA < numB)
                return false;
            return false;
        }
    }
    // tìm phân số lớn nhất
    public static Fraction findMax(){
        Fraction maxFrac = list.get(0);
        for (int i = 1;i<list.size();i++){
            if (!isBigger(maxFrac,list.get(i))){
                maxFrac = list.get(i);
            }
        }
        return maxFrac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Choose one number");
            System.out.println("1. Enter list fraction");
            System.out.println("2. Print list fraction");
            System.out.println("3. Add fraction");
            System.out.println("4. Delete fraction at k position");
            System.out.println("5. Edit fraction at k position");
            System.out.println("6. Find max fraction");
            System.out.println("7. Delete all fraction");
            System.out.println("0. Exit");
            System.out.println("------------------------------------------");

            num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 1:
                    System.out.print("Enter count of list fraction:");
                    int numOf = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < numOf; i++) {
                        enterFraction(sc);
                    }
                    break;
                case 2:
                    printList();
                    break;
                case 3:
                    enterFraction(sc);
                    break;
                case 4:
                    System.out.print("Enter k position - delete: ");
                    int posi = sc.nextInt();
                    sc.nextLine();
                    list.remove(posi-1);
                    System.out.println("Deleted !!!!");
                    break;
                case 5:
                    System.out.print("Enter k position - edit: ");
                    int posi2 = sc.nextInt();
                    Fraction f = list.get(posi2-1);
                    // edit em biết làm nhưng nó nhiều code em lười code, em code chức năng khác trước nhen
                    break;
                case 6:
                    System.out.println("Max fraction: ");
                    Fraction fraction = findMax();
                    System.out.println(fraction.getA()+"/"+ fraction.getB());
                    break;
                case 7:
                    for (int i = 0;i<list.size();i++){
                        list.removeAll(list);
                    }
                    System.out.println("GetSize: "+ list.size()+ " -- Done");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
        while (num != 0);
    }
}
