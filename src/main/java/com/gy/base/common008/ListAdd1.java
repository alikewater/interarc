package com.gy.base.common008;

import java.util.ArrayList;
import java.util.List;

public class ListAdd1 {

    //在线程2中判断容器的元素个数，通过读取个数指示进行条件判断，符合volatile的应用条件之一
    private volatile static List list = new ArrayList();

    public void add(){
        list.add("bjsxt");
    }
    public int size(){
        return list.size();
    }

    public static void main(String[] args) {

        final ListAdd1 list1 = new ListAdd1();

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                try {
                    for(int i = 0; i <10; i++){
                        list1.add();
                        System.out.println("当前线程：" + Thread.currentThread().getName() + "添加了一个元素..");
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1");

        //通过线程轮询查看是否到达条件，效率较低
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                while(true){
                    if(list1.size() == 5){
                        System.out.println("当前线程收到通知：" + Thread.currentThread().getName() + " list size = 5 线程停止..");
                        throw new RuntimeException();
                    }
                }
            }
        }, "t2");

        t1.start();
        t2.start();
    }


}

