package com.yto.test.collection.TreeSet;

public class R implements Comparable {
    int count;
    public  R(int count){
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R)o;
        return count>r.count? 1 :
                count<r.count? -1:0;
    }

    @Override
    public String toString() {
        return "R{" + "count=" + count + '}';
    }

    @Override
    public boolean equals(Object o) {
        // 如果为同一对象的不同引用,则相同
        if (this == o) {
            return true;
        }
        // 传入的对象非空,且两者属于相同的类型
        if (o != null && o.getClass() == R.class) {
            R r = (R) o;
            return r.count == this.count;
        }
        return false;
    }


}
