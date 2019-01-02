package com.yto1114;

/**
 * @author 01418061(cuizhiwen)
 * @Description:
 * @date 2018/11/29 13:18
 */
public interface Comparator<T> {
    /**
     * 自定义比较器
     * @param first
     * @param second
     * @return
     */
    int compare(T first,T second);
}
