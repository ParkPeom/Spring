package com.di.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


// xml������ �о�帮�� �۾�
public class ResultMain {

	public static void main(String[] args) {

		
		// ��üȭ ��ų���̴�. 	
		//xml ������ ��üȭ �ϱ� - > �޸𸮻� �÷����� ����������
		String path = "com/di/test/applicationContext.xml"; // ���� ��� 
		
		// ������ �о ��üȭ
		
		Resource res = new ClassPathResource(path); // ������ �о �־��� , res ���� xml�����̵�
		
		// ���� ������ �����ؼ� ��üȭ ��Ų��.
		BeanFactory factory = new XmlBeanFactory(res); // ���� �۾��� ���ؼ� xml������ ��üȭ��
		// ���� test1 �� testservice�� �������
		
		
		// TestService�� getValue�������
		// �޸� �Ҵ�� ��ü �ҷ����� 
		TestService ob = (TestService)factory.getBean("testService"); // ���丮�� ��üȭ�������Ƿ� �ٿ�ĳ���� , �ٺ��� ���ؼ� ��ü testService �������� ��ü���޾Ƴ�  
		System.out.println(ob.getValue());

		// �������� �������� ���̱� ���ؼ� �߰��� �Ű�ü(TestService)�� �޾Ƽ� TestService�� ������ ������ ������ �ϰԵ�
		
/*//Test ob1 = new TestImpl1(); // �⺻������ ��ü����
//System.out.println(ob1.result());
//
//Test ob2 = new TestImpl2();
//System.out.println(ob2.result());
//
//
//// ������ �Ʒ��� �ٲܼ��ִ�. 
///*Test ob;
//ob = new TestImpl1();
//System.out.println(ob.result());
//
//ob = new TestImpl2();
//System.out.println(ob.result());
*/	}
}



//�������� ��ü�� ������� applicationContext.xml �� �ʿ��ϴ�.
// ���̷�Ʈ�� �������� �ʰ� �߰��� ������ġ�� ���񽺶�� ����Ѵ�.
