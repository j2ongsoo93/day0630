package com.example.demo;

public class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("작압수행: "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
