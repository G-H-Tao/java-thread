package com.haitao.SingleTon;

/**
 * 在这里使用volatile阻止重排序
 * 第一个singleTon5判断是为了防止马上进去锁竞争,优化
 * 第二个singleTon5判断是真正气作用的,检测是否单列
 */
public class SingleTon5 {

    private static volatile SingleTon5 singleTon5 = null;
    private SingleTon5(){

    }

    public static SingleTon5 getInstance(){
        if (singleTon5 == null){
            synchronized (SingleTon5.class){
                if (singleTon5 == null){
                    singleTon5 = new SingleTon5();
                }
            }
        }
        return singleTon5;
    }
}
