package com.haitao.SingleTon;

/**
 * 普通单列.未考虑高并发,如果有线程1,2
 * 线程1在singleTon2 == null的时候 时间片切换到线程2,线程2也判断==null,这样两个都进入了
 * 这个时候两者都急进入了判断条件,然后new对象出来,这就不是单列模式了
 */
public class SingleTon2 {

    private static SingleTon2 singleTon2 = null;

    private SingleTon2(){

    }

    public SingleTon2 getInstance(){
        if (singleTon2 == null){
            singleTon2 = new SingleTon2();
        }
        return singleTon2;
    }
}
