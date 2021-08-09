package Lab_4;

import java.util.Scanner;

public class App {

    public static int sum2a (int n){
        int s = 0;
        for(int i = 0;i<n;i++){
            s += i;
        }
        return s;
    }

    public static boolean isPrimeNumber(int n){
        boolean result = true;

        for (int i = 2; i < n; i++){
            if(n%i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

//        int s2a = sum2a(n);
//        System.out.format("Sum 2a = %d\n", s2a);
        if(isPrimeNumber(n)){
            System.out.format("%d là số nguyên tố.\n",n);
        }else {
            System.out.format("%d không là số nguyên tố.\n",n);
        }
    }
}
