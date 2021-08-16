package Lab_6;

public class Bai_3 {
    public int printTimes(String s, char c){
     char[] arr  = s.toCharArray();
     int count = 0;
     for(int i=0;i<arr.length;i++){
         if(c == arr[i]){
             count++;
         }
     }
     return count;
    }

    public static void main(String[] args) {
        Bai_3 b3 = new Bai_3();
        System.out.println("Number of occurrences of the character c: " + b3.printTimes("OanhNguyen123",'4'));
    }
}
