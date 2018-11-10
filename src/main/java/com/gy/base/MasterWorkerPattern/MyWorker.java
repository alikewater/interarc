package com.gy.base.MasterWorkerPattern;

public class MyWorker extends Worker {

    @Override
    public   Object handle(Task input) {
        Object output = null;
        try {
            //处理任务的耗时。。 比如说进行操作数据库。。。
            Thread.sleep(500);
            output = input.getPrice();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return output;
    }
}
