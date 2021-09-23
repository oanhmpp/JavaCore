package Lap_13_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDate {
    public static void main(String[] args) {
        /**Bài 1*/
        String text1 = "Hello 12/10/1999, hello 30-10-1999";
        Pattern p = Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher m = p.matcher(text1);

        System.out.println("Bài 1: ");
        while (m.find()){
            System.out.println(text1.substring(m.start(),m.end()));
        }

        /**Bài 1*/
        String text2 = "Hello email oanhmpp@gmail.com và oanh12@gmail.com.net";
        Pattern p2 = Pattern.compile("[a-zA-Z0-9-]{3,15}@[a-z].?[a-z]{2,}.[a-z]{2,}");
        Matcher m2 = p2.matcher(text2);

        System.out.println("Bài 2: ");
        while (m2.find()){
            System.out.println(text2.substring(m2.start(),m2.end()));
        }
    }
}
