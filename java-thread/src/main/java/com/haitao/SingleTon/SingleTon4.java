package com.haitao.SingleTon;

/**
 * 在最外层加了singleTon4的判断,避免都要进一步进去同步快,同步快是一个重量级的操作,不要轻易产生竞争
 * 这样就没有问题了吗?还有有问题的
 * 有三个线程1,2,3 线程1获得同步块,进入执行singleTon4=new SingleTon4()
 * 线程2被阻塞在外面,看样子没有问题
 * 当线程1执行的时候,被拆成四步,1 malloc内存 2 初始化内存 3 构造函数运行内存 4 将这块内存实例赋值非singleTon4,
 * 要明白如果按照这样的顺序执行呢?1,4,2,3 有人要问了,怎么可能,synchronized 是保持有序性的,这点恐怕大多数没搞清楚
 * 原理是synchronized的有序性是通过串行化保证的,对于内部代码排序并不负责(as-if-serial语义)
 */
public class SingleTon4 {
    private static SingleTon4 singleTon4 = null;
    private SingleTon4(){

    }

    public static SingleTon4 getInstance(){
        if (singleTon4 == null){
            synchronized (SingleTon4.class){
                if (singleTon4 == null){
                    singleTon4 = new SingleTon4();
                }
            }
        }
        return singleTon4;
    }
}
