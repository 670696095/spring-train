package com.yto.test.Factory;

public class Printer implements output,product {
    private String[] printDate = new String[MAX_CACHE_LINE];
    private int dataNum = 0;

    @Override
    public void out() {
        //知道有作业就继续打印
        while (dataNum > 0) {
            System.out.println("打印机打印： " + printDate[0]);
            System.arraycopy(printDate, 1, printDate, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE) {
            System.out.println("队列已满添加失败");
        } else {
            printDate[dataNum] = msg;
            dataNum++;
        }

    }

    @Override
    public int getproductTime() {
        return 45;
    }

    public static void main(String[] args) {
        /*output o = new Printer();
        o.getData("轻量级");
        o.getData("疯狂java讲义");
        o.out();
        o.getData("疯狂安卓讲义");
        o.getData("疯狂AJAX讲义");
        o.out();

        o.print("孙悟空","猪八戒","唐曾");
        o.test();
        System.out.println(output.staticTest());
        product p = new Printer();
        System.out.println(p.getproductTime());
        Object obj = p;*/





    }
}
