package com.yto1114;

public class LengthComparator implements Comparator<String>, java.util.Comparator<String>,Comparable{
    @Override
    public int compare(String first, String second) {
        return first.length()-second.length();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
