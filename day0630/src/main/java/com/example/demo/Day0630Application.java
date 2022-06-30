package com.example.demo;

import java.util.ArrayList;
import java.util.function.IntFunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day0630Application {

	public static void main(String[] args) {
		SpringApplication.run(Day0630Application.class, args);
		
//		MyThread2 t = new MyThread2();
//		(new Thread(t)).start();
		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for(int i=1;i<=10;i++) {
//					System.out.println("작업수행: "+i);
//					try {
//						Thread.sleep(100);
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//				}
//			}).start();
		
//		new Thread(()->{
//			for(int i=1;i<=10;i++) {
//				System.out.println("작업수행: "+i);
//				try {
//					Thread.sleep(100);
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//			}
//		}).start();
		
//		AnimalSound dog = ()->{System.out.println("멍멍");};
//		dog.sound();
		
//		Math add = (a, b)->a+b;
//		Math sub = (a, b)->{return a-b;};
//		Math multi = (a, b)->{return a*b;};
//		
//		System.out.println(add.calc(5,3));
//		System.out.println(sub.calc(5,3));
//		System.out.println(multi.calc(5,3));
		
//		IntFunction<String> r = (a)->a+100+"";
//		System.out.println(r.apply(50));
		
		//전달받은 숫자 만큼 arrayList를 생성하여 모든 요소에 숫자만큼 100으로 채워진 
		IntFunction<ArrayList<Integer>> r = (a)->{
			ArrayList<Integer> b = new ArrayList<Integer>();
			for(int i=0;i<a;i++) {
				b.add(100);
			}
			return b;
		};
		System.out.println(r.apply(6).toString());
		System.out.println(r.apply(6));
		}
	
		//매개변수로 전달받은 값보다 더큰 값의 요소로 구성된 리스트를 반환하는 기능 작성
		int[] arr = {9,2,3,100,7,6,5,20,5,8,7,9,30};
	
		IntFunction<ArrayList<Integer>> selectBigger = (a)->{
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int b: arr) {
				if(b>a) {
					list.add(b);
				}
			}
			return list;
		};
		
}
