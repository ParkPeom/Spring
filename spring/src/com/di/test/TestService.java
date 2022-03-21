package com.di.test;


// applicationContext -> TestService(���濪��) -> TestImpl1 , TestImpl2 ����

/*���̷�Ʈ�� ���°� �ƴ϶�
�߰��ܰ� ���� ����������*/

public class TestService {

	private Test test;
	
	// TestService�� ��ü�� �����ؾ� TestService�����ڸ� �����ִ�.
	public TestService() {
		
	}
	
	// �������̽����� �־��ָ� �ʱ�ȭ , result ��밡�� 
	// �̱���� �����������̶�� �Ѵ�.
	
	public TestService(Test test) {	
		this.test = test;
	}
	
	// �޼ҵ� ������Ƽ�� ���� ������ ���� 
	// Test test = new TestImple1
	public void setTest(Test test) { // test
		this.test = test;
	}
	
	public String getValue() 
	{
		return test.result(); // test�� ������ �ִ� result�޼ҵ带 �����̴�.
	}
	
}
