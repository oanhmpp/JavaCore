package Lab_7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number row:");
        int r = sc.nextInt();
        System.out.println("Enter number collum: ");
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length;j++){
                System.out.println("Arr["+i+"]["+j+"]:");
                arr[i][j] = sc.nextInt();
            }
        }
        printMatrix(arr);

    }
    public static void printMatrix(int[][] a){
        for (int i = 0 ; i < a.length;i++){
            for (int j=0;j < a[0].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
