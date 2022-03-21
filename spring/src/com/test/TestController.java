package com.test;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

// mvc�� controller �̴�. 
// AbstractController  �� ��ӹް� �޼ҵ带 �߰��� 
// handleRequestInternal : executeó�� �˾Ƽ� ����� 
// ModelAndView : mvc���� c�ºй�� �� �ּҸ� �������� �Ϸΰ�~
//  view�� jsp����  medel�� ������  modelAndView �� view + model �̴�.

public class TestController extends AbstractController {

	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String msg = "";	
		if(hour>=6&&hour<=8) {
			msg = "��ħ�Դϴ�";
		} else if(hour>=8&&hour<=13) {
			msg = "�����Դϴ�";
		} else if(hour>=13&&hour<=14) {
			msg = "���ɽð��Դϴ�";
		} else if(hour>=14&&hour<=18) {
			msg = "�����Դϴ�";
		} else {
			msg = "���� �Դϴ�";
		}
		
		request.setAttribute("msg", msg); // msg�� �������� ����?
		
		// �й�� ������ ���⼭ �ع���
		// test/view�� �� ~ view.jsp (dispatcher.servlet���� suffix value=".jsp"�� ����� �Ƚᵵ��)
		
		
		
		return new ModelAndView("test/view");
	}
	
}
