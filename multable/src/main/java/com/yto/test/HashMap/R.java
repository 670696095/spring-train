package com.yto.test.HashMap;

/**
 * @author czw
 */
public class R implements  Comparable {
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }if(obj != null && obj.getClass() == R.class ) {
            R r = (R)obj;
            return  r.count == this.count;
        }
        return false;
    }

    @Override
    public String toString() {
        return "R{count:"+count+"}";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
