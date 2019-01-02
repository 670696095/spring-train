package com.yto.test.CacheImmutable;

/**
 * 缓存实例的不可变类
 * @author  czw
 */
public class CacheImmutable {
    private  static int MAX_SIZE = 5;

    private static  CacheImmutable [] cache = new CacheImmutable[MAX_SIZE];
    private  static int pos = 0;
    private  final  String name;
    private  CacheImmutable (String name){
        this.name = name;
    }
    public  String getName(){
        return name;
    }
    public  static CacheImmutable valueof(String name){
        for (int i = 0 ;i<MAX_SIZE ;i++){
            if (cache[i] != null&&cache[i].getName().equals(name)){
                return  cache[i];
            }
        }
        if (pos == MAX_SIZE){
            cache[0] = new CacheImmutable(name);
            pos = 1;
        }else {
            cache[pos++] = new CacheImmutable(name);
        }
        return cache[pos - 1];
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return  true;
        }
        if (obj != null&&obj.getClass() == CacheImmutable.class){
            CacheImmutable ci = (CacheImmutable)obj;
            return  name.equals(ci.getName());
        }
        return  false;
    }

    public static void main(String[] args) {
        CacheImmutable c1 = CacheImmutable.valueof("1");
        CacheImmutable c2 = CacheImmutable.valueof("2");
        CacheImmutable c3 = CacheImmutable.valueof("3");
        CacheImmutable c4 = CacheImmutable.valueof("4");
        CacheImmutable c5 = CacheImmutable.valueof("5");
        CacheImmutable c6 = CacheImmutable.valueof("6");
        CacheImmutable c7 = CacheImmutable.valueof("7");
        CacheImmutable c8 = CacheImmutable.valueof("7");

        for(int i = 0;i<cache.length;i++){
            System.out.println(cache[i].toString());
        }


        System.out.println("测试");
        System.out.println(c8==c7);

    }
}
