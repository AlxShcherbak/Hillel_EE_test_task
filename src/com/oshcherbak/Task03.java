package com.oshcherbak;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by oshcherbak on 10/6/17.
 *
 * Task:
 * Given the following class;
 *   public class IncrementSynchronize {
 *      private int value = 0;
 *      //getNextValue()
 *   }
 * Write three different method options for getNextValue() that will return 'value++', each method needs
 * to be synchronized in a different way.
 */
public class Task03 {
    public static class IncrementSynchronize{
        private int value = 0;
        private final Object ob = new Object();

        private AtomicInteger valueAtomic = new AtomicInteger(0);

        public synchronized int getNextValue() {
            return value++;
        }

        public int getNextValue2(){
            synchronized (this){
                return value++;
            }
        }

        public int getNextValue3(){
            synchronized (ob) {
                return value++;
            }
        }

        public int getNextValue4(){
            return valueAtomic.getAndIncrement();
        }
    }
}
