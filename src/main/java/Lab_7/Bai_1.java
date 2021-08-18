package Lab_7;

import Lab_4.Bai_4;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class Bai_1 {
    // tim mang m x n có chứa phần tử x hay không
    public static boolean hasXInArr(int[][] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == x)
                    return true;
            }
        }
        return false;
    }

    // ma tran a co phai la ma tran toan so nguyen to khong
    public static boolean isPrimeArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!Bai_4.isPrime(arr[i][j]))
                    return false;
            }
        }
        return true;
    }

    // tim gia tri lon nhat trong ma tran a
    public static int maxInArr(int[][] arr) {
        int max = arr[0][0];
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.print("arr[" + x + "][" + y + "]: ");
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number row:");
        int r = sc.nextInt();
        System.out.println("Enter number collum: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Arr[" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Please enter x: ");
        int x = sc.nextInt();

        //bai 1
        if (hasXInArr(arr, x)) {
            System.out.println("The arr has contain x !!");
        } else {
            System.out.println("The arr has not contain x !!");

        }

        //bai 2
        if (isPrimeArr(arr)) {
            System.out.println("This is a matrix of all primes !!");
        } else {
            System.out.println("This is not a matrix of all primes !!");
        }

        // bai 3
        System.out.println("Max of arr is: ");
        System.out.println(maxInArr(arr));
    }
}
