package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

 // dto�� �޾Ƽ� ó�����ִ¾ָ� ����� ( ������ó���ϴ���Ʈ�ѷ�)
public class ListController extends AbstractCommandController {

	// ������
	public ListController() {
		setCommandClass(ListCommand.class); // DTO.class 
		setCommandName("listCommand"); // DTO��ü����  
		// ListCommand listCommand = new ListCommand(); �� �ڵ��� �Ȱ���. ��ü�� ����
	
	}
	
	
	// ������ ���� DTO�� Object command�� ������
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		// ������ Object�� , �������ϱ� �ٿ�ĳ����
		ListCommand vo = (ListCommand)command;
		
		String message = "�̸� : " + vo.getUserName();
		
		message += ", ���̵� : " + vo.getUserId();
		
		request.setAttribute("message", message); // �̸� �� ���̵� 
		
		
		// �������� �ѱ��
		return new ModelAndView("test/write_ok");
	}
}
