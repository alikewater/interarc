package com.gy.base.sync007;

import java.io.IOException;

/*子线程对变量的修改对主线程可见，主线程对变量的修改对子线程不可见，当调用打印IO操作后，对变量的修改变得可见
* volatile的只能解决可见性问题，不满足原子性，因此直接赋值的场景可使用，类似于依赖于变量自身或者依赖于
* 其他volatile变量的场景不适合，可使用synchronized 或者采用线程安全的数据类型*/
public class RunThread extends Thread{

    private int isRunning = 5;
    private void setRunning(int isRunning){
        this.isRunning = isRunning;
    }


    public void run(){
        System.out.println("进入run方法..");
        int i = 0;

        System.out.println("当前值"+isRunning);
        while(isRunning>0){
            //isRunning--;
            //System.out.println(isRunning);

        }
        System.out.println("stop..");
    }

    //子线程启动完成后（调用start并有相关的启动时间）对isRunning的赋值在子线程中访问不到
    public static void main(String[] args) throws InterruptedException, IOException {
        RunThread rt = new RunThread();

        rt.start();

        Thread.sleep(2000);

        System.out.println("set...");
        rt.setRunning(-1);


    }


}