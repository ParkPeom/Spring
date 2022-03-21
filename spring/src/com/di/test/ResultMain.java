package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


// xml파일을 읽어드리는 작업
public class ResultMain {

	public static void main(String[] args) {

		
		// 객체화 시킬것이다. 	
		//xml 파일을 객체화 하기 - > 메모리상에 올려야지 읽을수있음
		String path = "com/di/test/applicationContext.xml"; // 파일 경로 
		
		// 내용을 읽어서 객체화
		
		Resource res = new ClassPathResource(path); // 내용을 읽어서 넣어줌 , res 에는 xml내용이들어감
		
		// 이제 내용을 실행해서 객체화 시킨다.
		BeanFactory factory = new XmlBeanFactory(res); // 세개 작업을 통해서 xml파일이 객체화됨
		// 이제 test1 과 testservice가 만들어짐
		
		
		// TestService에 getValue쓰고싶음
		// 메모리 할당된 객체 불러오기 
		TestService ob = (TestService)factory.getBean("testService"); // 팩토리가 객체화시켰으므로 다운캐스팅 , 겟빈을 통해서 빈객체 testService 가져오면 객체를받아냄  
		System.out.println(ob.getValue());

		// 스프링은 의존성을 줄이기 위해서 중간에 매개체(TestService)를 달아서 TestService를 가지고 간접적 접근을 하게됨
		
/*//Test ob1 = new TestImpl1(); // 기본생성자 객체생성
//System.out.println(ob1.result());
//
//Test ob2 = new TestImpl2();
//System.out.println(ob2.result());
//
//
//// 위에를 아래로 바꿀수있다. 
///*Test ob;
//ob = new TestImpl1();
//System.out.println(ob.result());
//
//ob = new TestImpl2();
//System.out.println(ob.result());
*/	}
}



//스프링의 객체로 만들려면 applicationContext.xml 이 필요하다.
// 다이렉트로 접근하지 않고 중간에 완충장치가 서비스라고 얘기한다.
