package com.yto1114;

import java.awt.event.ActionEvent;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2018/11/29 10:16
 */
public interface IActionListener {
    static String str = "123";
    void actionPerformed(ActionEvent event);

    /**
     * 接口中的默认方法
     */
    default void test(){
        System.out.println("我是默认方法");
    }
}
