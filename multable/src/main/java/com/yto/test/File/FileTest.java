package com.yto.test.File;

import java.io.File;

/**
 * @author czw
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File(".");
        file.mkdir();
        String [] fileList = file.list();
        for (String filename: fileList){
            System.out.println(filename);
        }
    }

}
