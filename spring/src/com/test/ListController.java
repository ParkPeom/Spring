package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

 // dto를 받아서 처리해주는애를 상속함 ( 데이터처리하는컨트롤러)
public class ListController extends AbstractCommandController {

	// 생성자
	public ListController() {
		setCommandClass(ListCommand.class); // DTO.class 
		setCommandName("listCommand"); // DTO객체생성  
		// ListCommand listCommand = new ListCommand(); 위 코딩과 똑같다. 객체를 생성
	
	}
	
	
	// 위에서 만든 DTO를 Object command로 가져옴
	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		
		// 받을때 Object로 , 가져오니까 다운캐스팅
		ListCommand vo = (ListCommand)command;
		
		String message = "이름 : " + vo.getUserName();
		
		message += ", 아이디 : " + vo.getUserId();
		
		request.setAttribute("message", message); // 이름 과 아이디 
		
		
		// 누구한테 넘기냐
		return new ModelAndView("test/write_ok");
	}
}
