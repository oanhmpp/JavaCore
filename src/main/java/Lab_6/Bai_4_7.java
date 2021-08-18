package Lab_6;

import java.util.Locale;
import java.util.Scanner;

public class Bai_4_7 {
    public static int countOfChar(String s) {
        s = s.trim();
        String[] arr = s.split(" +");
        return arr.length;
    }

    // dem nguyen am phu am
    public static String countVowelsConsonants(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int countV = 0;
        int countC = 0;
        for (char c : arr) {
            if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i') {
                countV++;
            } else if (c >= 'a' && c <= 'z') {
                countC++;
            }
        }
        return "Count Vowels: "+ countC+"\n" +"Count Consonants: "+ countV;
    }

    public static void main(String[] args) {
        Bai_4_7 b4 = new Bai_4_7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String: ");
        String s = sc.nextLine();
        // bai 4
//        System.out.println(countOfChar(s));
        // bai 7
        System.out.println(countVowelsConsonants(s));
    }
}
