package com.gy.base.coll014;

public class FetureTest {


    public static void main(String args[]){
        FutureClient fc = new FutureClient();

        Data futureData = fc.request("123");  //这里直接返回

        System.out.println(futureData.getRequest());

    }


}
