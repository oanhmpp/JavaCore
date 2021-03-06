package Lab_5;

import java.util.Scanner;

public class App {
    private static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a + "-");
        }
    }

    public static int[] generateArray(int n, int min, int max) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = (int) Math.floor(Math.random() * (max - min)) + min;
        }
        return result;
    }

    public static boolean isAllEven(int[] arr) {
        boolean result = true;
        for (int a : arr) {
            if(a%2!= 0){
                result = false;
                break;
            }
        }
        return result;
    }

    public int findMin(int[] arr){
        int min = arr[0];
        for(int a:arr){
            if(a<min){
                min=a;
            }
        }
        return min;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        System.out.println("n = ");
////        int n = sc.nextInt();
////
////        int[] arr = new int[n];
////        for (int i = 0; i < n; i++) {
////            System.out.format("a[%d] = ", i);
////            arr[i] = sc.nextInt();
////        }
////        printArr(arr);

        App a = new App();
        int [] arr = new int[]{6,2,3,43,2,4};
        System.out.println(a.findMin(arr));
    }


}
