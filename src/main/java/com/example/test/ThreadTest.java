package com.example.test;

import com.example.Log.LogUtil;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/6/7 </div>
 *
 * @author lekp
 * @since 1.0
 */
public class ThreadTest implements Runnable{
    private String threadName;
    private Thread t;
    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                LogUtil.debug(threadName+i);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            LogUtil.debug("");
        }
    }
    public void start(){
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    public static void main(String[] args) {
        ThreadTest t1=new ThreadTest("t1");
        t1.start();
        ThreadTest t2=new ThreadTest("t2");
        t2.start();
    }

    public ThreadTest(String threadName) {
        this.threadName = threadName;
    }
}
