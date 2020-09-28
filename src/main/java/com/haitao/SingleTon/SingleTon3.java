package com.haitao.SingleTon;

/**
 * 这种情况下,绝对没有错误,可见性,原子性,都考虑到了,并且instance判断咋同步块内部
 * 不存在有序性问题,但是,每次去获取单列都要单例获取同步锁,太重量级,
 */
public class SingleTon3 {

    private static SingleTon3 singleTon3 = null;
    private SingleTon3(){

    }

    public static SingleTon3 getInstance(){
        synchronized (SingleTon3.class){
            if (singleTon3 == null){
                singleTon3 = new SingleTon3();
            }
            return singleTon3;
        }
    }
}
