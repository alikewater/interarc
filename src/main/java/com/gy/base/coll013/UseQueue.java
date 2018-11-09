package com.gy.base.coll013;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;


public class UseQueue {

    public static void main(String[] args) throws Exception {

        //高性能无阻塞无界队列：ConcurrentLinkedQueue
        /**
         ConcurrentLinkedQueue<String> q = new ConcurrentLinkedQueue<String>();
         q.offer("a");
         q.offer("b");
         q.offer("c");
         q.offer("d");
         q.add("e");

         System.out.println(q.poll());	//a 从头部取出元素，并从队列里删除
         System.out.println(q.size());	//4
         System.out.println(q.peek());	//b
         System.out.println(q.size());	//4
         */


        /**/
//         ArrayBlockingQueue<String> array = new ArrayBlockingQueue<String>(5);
//
//         //offert添加成功返回true，不成功返回false，一次性添加
//        //add 一次性添加，添加成功返回true，添加不成功抛出异常
//        //put 一直添加，直到成功添加才退出
//         array.add("c");
//         array.add("d");
//         array.add("e");
//         array.add("f");
////         array.put("a");
////         array.put("b");  //put是保证一定要放进去，如果没放进去一直等待，一般不用
//         array.offer("d");
//         array.offer("dd");
//         System.out.println(array.offer("a", 3, TimeUnit.SECONDS));//在规定时间内一直添加
//        array.take();



        /**
         //阻塞队列
         LinkedBlockingQueue<String> q = new LinkedBlockingQueue<String>();
         q.offer("a");
         q.offer("b");
         q.offer("c");
         q.offer("d");
         q.offer("e");
         q.add("f");
         //System.out.println(q.size());

         //		for (Iterator iterator = q.iterator(); iterator.hasNext();) {
         //			String string = (String) iterator.next();
         //			System.out.println(string);
         //		}

         List<String> list = new ArrayList<String>();
         System.out.println(q.drainTo(list, 3));
         System.out.println(list.size());
         for (String string : list) {
         System.out.println(string);
         }
*/

//
        final SynchronousQueue<String> q = new SynchronousQueue<String>();
//        Thread t1 = new Thread(new Runnable() {
//
//            public void run() {
//                try {
//                    System.out.println(q.take());
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        t1.start();
//        Thread t2 = new Thread(new Runnable() {
//
//
//            public void run() {
//                q.add("asdasd");
//            }
//        });
//        t2.start();
//        q.take();
        q.offer("123");
        q.put("123");

        //q.put("123");
         q.add("123");

        System.out.println(q.poll());
    }
}

