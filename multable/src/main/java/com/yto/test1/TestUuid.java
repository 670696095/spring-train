package com.yto.test1;

import java.util.UUID;

/**
 * @author czw
 */
public class TestUuid {

    public static void main(String[] args) {

            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid);

    }
}

