package Lap_15_File;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ReadWriteFile {
    private static String nameFile = "." + File.separator + "data.txt";
    private static String nameFile1 = "." + File.separator + "data1.txt";
    private static String nameFile2 = "." + File.separator + "data2.txt";

    public static void main(String[] args) throws IOException {

        // ghi dữ liệu
        FileWriter writer = new FileWriter("." + File.separator + "data.txt", StandardCharsets.UTF_8);
        writer.write("3010");
        writer.flush();
        writer.close();
        System.out.println("Done file data.txt");

        FileWriter writer2 = new FileWriter("." + File.separator + "data1.txt", StandardCharsets.UTF_8);
        writer2.write("Nguyen Thi Hoang Oanh");
        writer2.flush();
        writer2.close();
        System.out.println("Done file data1.txt");

        // đọc dữ liệu và ghép dữ liệu
        FileReader read = new FileReader(nameFile);
        FileWriter writer3 = new FileWriter("." + File.separator + nameFile2, StandardCharsets.UTF_8, true);
        int data;
        while ((data = read.read()) != -1) {
            writer3.write(data);
        }

        read = new FileReader(nameFile1);
        while ((data = read.read()) != -1) {
            writer3.write(data);
        }
        read.close();

        writer3.flush();
        writer3.close();
    }

}
