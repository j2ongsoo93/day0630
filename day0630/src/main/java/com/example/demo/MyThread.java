package com.example.demo;

public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i=0;i<=10;i++) {
			System.out.println("작업수행: "+i);
				
		}
	}
	
}
