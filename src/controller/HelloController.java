package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * ������
 * handler
 * @author lixia18
 *
 */
public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//��ȡ����
        //ת������
        //����
		ModelAndView mv = new ModelAndView();
		String name = request.getParameter("name");
		//����model����
        mv.addObject("msg","Hello Spring MVC"+name);
        //������ͼ
        mv.setViewName("hello");
        
		return mv;
	}

}
