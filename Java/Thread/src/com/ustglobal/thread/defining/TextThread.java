package com.ustglobal.thread.defining;

public class TextThread {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyThread t1 = new MyThread();
		t1.start();
//		t1.start(); IllegalThreadStateException.... only once start() method should
//		be called..
		
//		t1.run();
//		Don't call run() method, it behaves like normal program
//		all code will be executed inside main thread only
		
		for(int i = 0;i<10;i++) {
			System.out.println("Main thread");
		}
		
		System.out.println("Main ended");
	}
}
