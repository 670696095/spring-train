package com.yto.test.File;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author czw
 */
public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("FileInputStreamTest.java");
        byte [] bbuf = new byte[1024];
    }
}
