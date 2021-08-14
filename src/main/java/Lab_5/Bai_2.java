package Lab_5;

import Lab_4.Bai_4;

public class Bai_2 {
    // b ktra co phai la mang so nguyen to khong
    public boolean isArrayOfPrimes (int [] arr){
        boolean result = true;
        for (int a:arr ) {
            if(!Bai_4.isPrime(a)){
                result = false;
                break;
            }
        }
        return result;
    }

    // c mang co phai la cac so tang dan khong
    public boolean isArrOfIncreaseNumbers(int[] arr){
        boolean result = true;
        for (int i = 0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                result = false;
                break;
            }
        }
        return result;
    }
}
