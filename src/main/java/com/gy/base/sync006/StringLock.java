package com.gy.base.sync006;

/**
 * synchronized代码块对字符串的锁，注意String常量池的缓存功能,不同应用如果采用常量加锁的话会导致其他应用被隐含的同步掉
 * @author alienware
 *
 */
public class StringLock {

    public void method() {
        //new String("字符串常量")
        synchronized ("字符串常量") {
            try {
                //while(true){
                    System.out.println("当前线程 : "  + Thread.currentThread().getName() + "开始");
                    Thread.sleep(1000);
                    System.out.println("当前线程 : "  + Thread.currentThread().getName() + "结束");
                //}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final StringLock stringLock = new StringLock();
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                stringLock.method();
            }
        },"t1");

        //这时候t2代表与t1并不相关的另外一个应用里面的线程，会由于jvm共享常量池而被动与t1同步
        //采用new 创建string对象可以模拟两个应用拥有不同对象的锁
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                stringLock.method();
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
