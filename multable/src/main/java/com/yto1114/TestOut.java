package com.yto1114;

public class TestOut implements Collection {

    public static void main(String[] args)  {
       // System.out.print("");
        //System.out.println(ETest.values().length);
        try{
            String s ="java.util.Random";
            Class m  = Class.forName(s);
        }catch (Exception e){
            e.printStackTrace();

        }

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
