package Lap_15_File;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CoppyFile {
    private static String nameFile = "." + File.separator + "data.txt";
    private static String nameFile1 = "." + File.separator + "data1.txt";

    public static void main(String[] args) throws IOException {
        // đọc dữ liệu và ghép dữ liệu
        FileReader read = new FileReader(nameFile);
        FileWriter writer2 = new FileWriter("." + File.separator + nameFile1, StandardCharsets.UTF_8, true);
        int data;
        while ((data = read.read()) != -1) {
            writer2.write(data);
        }
        read.close();

        writer2.flush();
        writer2.close();
    }

}
