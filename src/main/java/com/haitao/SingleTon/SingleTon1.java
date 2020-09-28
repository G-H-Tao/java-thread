package com.haitao.SingleTon;

/**
 * 饿汉式
 * 如何保证单例
 * 利用类的初始化的时候jvm的单列功能
 * 特点:简单,易于理解,方便操作并且安全
 * 缺点:预先支配内存,不过问题不大
 */
public class SingleTon1 {

    private static SingleTon1 singleTon1 = null;

    static {
        singleTon1 = new SingleTon1();
    }

    private SingleTon1(){
    }

    public static SingleTon1 getInstance(){
        return singleTon1;
    }
}
