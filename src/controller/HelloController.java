package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 处理器
 * handler
 * @author lixia18
 *
 */
public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//获取请求
        //转发请求
        //返回
		ModelAndView mv = new ModelAndView();
		String name = request.getParameter("name");
		//设置model数据
        mv.addObject("msg","Hello Spring MVC"+name);
        //设置视图
        mv.setViewName("hello");
        
		return mv;
	}

}
