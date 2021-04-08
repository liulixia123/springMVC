package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.User;
/**
 * 处理请求
 * @author lixia18
 *
 */
@Controller
public class HelloWorldController {
	
	@RequestMapping(value="show")
	public String show(Model model) {
		
		List<User> users = new ArrayList<>();
        User user = new User(1,"xd");
        users.add(user);
        user = new User(2,"xd2");
        users.add(user);
        model.addAttribute("users",users);
        return "show";
	}
	
	@RequestMapping("delete/{id}")
	public String delete(@PathVariable int id){
	    System.out.println(id); 
	    return "redirect:/show";//转发
	}
	@RequestMapping("ajaxData")	
	public @ResponseBody User ajaxData(@RequestBody User user){
	    System.out.println(user); 
	    return user;
	}
}
