package com.example.smallwhite.juc;import java.util.concurrent.CountDownLatch;import java.util.concurrent.LinkedBlockingQueue;import java.util.concurrent.ThreadPoolExecutor;import java.util.concurrent.TimeUnit;/** *  countDownLatch 可以让所有线程执行完了之后再执行主线程 * @author: yangqiang * @create: 2021-03-29 21:32 */public class CountDownWatchTest {    public static void main(String[] args) throws InterruptedException {        CountDownLatch countDownLatch = new CountDownLatch(2);        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());        for (int i = 0; i < 2; i++) {            threadPoolExecutor.execute(()->{                System.out.println("11");                countDownLatch.countDown();            });        }        //主线程最多等待1s 如果其他线程未执行完的话继续往下执行        // countDownLatch.await(1,TimeUnit.SECONDS);        //主线程等待其他线程执行完        countDownLatch.await();        System.out.println("1");    }}