package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//�ִ� �����͸� ó�����ִ� ��Ʈ�ѷ� - 
//����� ���ö� DTO�� �������µ� DTO�� ���� �׸��� �ʿ��ѵ� 
// �װ� ListFormController�̴�.
//�׸��� �ڵ����� command���� ����.
public class ListFormController implements Controller  {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// test/write ���� �� �����ϱ� ��ư ������ write_ok.action ã�ư��� 
		
		
		
		return new ModelAndView("test/write"); // controller ���� test/write�� ã�ư��� 
	}	
}
