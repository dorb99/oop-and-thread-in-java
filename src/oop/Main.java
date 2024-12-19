package oop;

import threads.MultiThread;

public class Main {
    public static void main(String[] args) {
    	MultiThread mt1 = new MultiThread();
    	MultiThread mt2 = new MultiThread();
    	MultiThread mt3 = new MultiThread();
    	MultiThread mt4 = new MultiThread();
    	Thread t1 = new Thread(mt1, "Thread-1");
    	Thread t2 = new Thread(mt2, "Thread-2");
    	Thread t3 = new Thread(mt3, "Thread-3");
    	Thread t4 = new Thread(mt4, "Thread-4");

    	
    	t1.start();
    	t1.setPriority(4);
    	
    	t2.start();
    	t2.setPriority(6);
    	t3.start();
    	t4.start();
    	t4.setPriority(7);
    	
    	
    }

}
