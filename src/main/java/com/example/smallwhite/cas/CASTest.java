package com.example.smallwhite.cas;import java.util.concurrent.CountDownLatch;import java.util.concurrent.ExecutorService;import java.util.concurrent.Executors;import java.util.concurrent.atomic.AtomicInteger;import java.util.concurrent.locks.AbstractQueuedSynchronizer;/** * AtomicInteger 进行CAS操作 * @author: yangqiang * @create: 2021-03-16 17:32 */public class CASTest {    public static void main(String[] args) throws InterruptedException {        Integer count = 2;            CountDownLatch countDownLatch = new CountDownLatch(count);            Long startMs = System.currentTimeMillis();            TestAtomicInteger atomicInteger = new TestAtomicInteger();            ExecutorService executorService = Executors.newFixedThreadPool(count);            for (int i = 0; i < count; i++) {                executorService.execute(new Runnable() {                    @Override                    public void run() {                            atomicInteger.addOne();                        countDownLatch.countDown();                    }                });            }            executorService.shutdown();            System.out.println(atomicInteger.get());    }}