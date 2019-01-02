package com.yto1114;

public class TimerTest {
    public static void main(String[] args) {
       /* ActionListener listener = new TimePrinter();
        IActionListener iActionListener = new TimePrinter();
        iActionListener.test();
        //iActionListener.actionPerformed();
        System.out.println(IActionListener.str);
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);*/
       String str =null;
       for(int i = 0 ;i< 2;i++) {
           try {
               str.length();
           }catch (Exception e){
               System.out.println("----"+i);
               break;
           }
           finally {
               System.out.println("fin"+i);
           }
       }
       }

}


