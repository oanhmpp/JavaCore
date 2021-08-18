package Lab_6;

public class Bai_2 {
    public String printNonNumber(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i])) {
                result += arr[i] + "";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Bai_2 b2 = new Bai_2();
        System.out.println("String after removing number: " + b2.printNonNumber("OanhNguyen123"));
    }
}
