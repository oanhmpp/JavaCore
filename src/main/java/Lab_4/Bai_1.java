package Lab_4;

import java.util.Scanner;

public class Bai_1 {
    // tach so nhap vao thanh mang
    public static int[] numberSeparation(int n) {
        int temp = 0;
        int count = 0;
        int surplus = 0;
        int[] arr = new int[0];
        if (n > 0) {
            temp = n;
            while (n > 0) {
                n = n / 10;
                count++;
            }
            arr = new int[count];
            while (temp > 0) {
                surplus = temp % 10;
                arr[count - 1] = surplus;
                temp = temp / 10;
                count--;
            }
        }
        return arr;
    }

    // a - co phai so doi xung
    public boolean isSymmetricalNumber(int number) {
        int arr[] = numberSeparation(number);
        boolean result = true;
        int i = 0;
        if (number > 0) {
            if (arr.length % 2 == 0) {
                for (int j = arr.length - 1; j >= arr.length / 2; j--) {
                    while (arr[i] != arr[j]) {
                        result = false;
                        break;
                    }
                    i++;
                }
            } else {
                for (int j = arr.length - 1; j > arr.length / 2; j--) {
                    while (arr[i] != arr[j]) {
                        result = false;
                        break;
                    }
                    i++;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    // b - co phai so nguyen duong
    public boolean isSquareNumber(int number){
        boolean result = false;
        if(number>0){
            double d = Math.sqrt(number);
            if(d%1==0){
                result = true;
            }else {
                result = false;
            }
        }else {
            result = false;
        }
        return result;
    }

}
