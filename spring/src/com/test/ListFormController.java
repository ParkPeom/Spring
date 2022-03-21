package com.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//애는 데이터를 처리해주는 컨트롤러 - 
//여기로 들어올때 DTO를 가져오는데 DTO를 담을 그릇이 필요한데 
// 그게 ListFormController이다.
//그리고 자동으로 command으로 들어간다.
public class ListFormController implements Controller  {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// test/write 에서 값 전송하기 버튼 누르면 write_ok.action 찾아가라 
		
		
		
		return new ModelAndView("test/write"); // controller 역할 test/write로 찾아가라 
	}	
}
