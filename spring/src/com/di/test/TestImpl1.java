package com.di.test;

public class TestImpl1 implements Test {
	
	private int su1; // 0 -> 100
	private int su2; // 0 -> 200
	
	// 기본생성자
	// 매개변수로 받는것이 없으므로 this쓸필요없음
	public TestImpl1() {
		su1 = 10;
		su2 = 20;
	}
	
	// 오버로딩된 생성자
	// this 내것을 가르켜줘야함 
	public TestImpl1(int su1,int su2) {
		this.su1 = su1; // 100
		this.su2 = su2; // 200
	}
	
	// 100 + 200
	@Override
	public String result() {
		String str = String.format("%d+%d=%d", su1,su2,su1+su2);
		return str;
	}
	
}
