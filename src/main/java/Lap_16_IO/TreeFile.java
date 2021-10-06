package Lap_16_IO;

import java.io.File;

public class TreeFile {
    public static String printTreeFile(File folder) {
        if (!folder.isDirectory()) {
            return "This is not folder";
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
