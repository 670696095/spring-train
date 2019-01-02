package com.yto.test.HashMap;

/**
 * @author czw
 */
public class A {
    int count;
    public  A(int  count){
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o != null &&o.getClass() == A.class) {


            A a = (A) o;
            return this.count == a.count;
        }
        return false;
    }

    @Override
    public int hashCode() {

        return this.count;
    }
}
