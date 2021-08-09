package Lab_4;

public class Bai_2 {
    // so nguyen
    public boolean isInteger(double n){
        if(n>0 && n%1==0){
            return true;
        }else {
            return false;
        }
    }
    // d - tinh 1*2*...*n = n!
    public int calculateD (int n){
        int result = 1;
        if(n>0 && isInteger(n)){
            while (n>0){
                if(n == 1){
                    result *= n;
                } else {
                    result *= n * (n - 1);
                }
                n = n - 2;
            }
        }else {
            System.out.println("Error - Please enter n again !!");
        }
        return result;
    }
    // e - tinh 1! + 2! + ... + n!
    public int calculateE (int n){
        int result = 0;
        while (n>0){
            result += calculateD(n);
            n--;
        }
        return result;
    }
}
