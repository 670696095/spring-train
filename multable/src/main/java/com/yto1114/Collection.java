package com.yto1114;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2018/11/28 17:46
 */
public interface Collection {
    int size();
    default boolean isEmpty(){
        return size() == 0;
    }
}
