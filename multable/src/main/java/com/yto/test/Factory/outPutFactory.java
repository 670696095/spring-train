package com.yto.test.Factory;

public class outPutFactory {

        public output getOutput(){
            return  new Printer();
        }

        public static void main(String[] args) {
            outPutFactory opf = new outPutFactory();
            Computer c = new Computer(opf.getOutput());
            c.keyIn("疯狂javaEE企业级实战");
            c.keyIn("疯狂java讲义");
            c.print();
            System.out.println(output.MAX_CACHE_LINE);
            System.out.println(output.staticTest());

        }

}
