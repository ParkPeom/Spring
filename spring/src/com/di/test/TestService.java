package com.di.test;


// applicationContext -> TestService(완충역할) -> TestImpl1 , TestImpl2 접근

/*다이렉트로 쓰는게 아니라
중간단계 무언가 만들어줘야함*/

public class TestService {

	private Test test;
	
	// TestService도 객체가 생성해야 TestService생성자를 슬수있다.
	public TestService() {
		
	}
	
	// 인터페이스값만 넣어주면 초기화 , result 사용가능 
	// 이기능을 의존성주입이라고 한다.
	
	public TestService(Test test) {	
		this.test = test;
	}
	
	// 메소드 프로퍼티를 통한 의존성 주입 
	// Test test = new TestImple1
	public void setTest(Test test) { // test
		this.test = test;
	}
	
	public String getValue() 
	{
		return test.result(); // test가 가지고 있는 result메소드를 쓸것이다.
	}
	
}
