package com.example.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userSevice;
	
	 @Value("${general.secretKey}")
	 private String masKey;

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String backMessage(){
		return "this is the back message !";
	}
	
	@RequestMapping(value="/find",method=RequestMethod.GET)
	@ResponseBody
	public List<User> findAllUser(){
		List<User> lists =  (List<User>) userSevice.findAll();
		return lists;
		//return "this is the back message !lists size "+lists.size();
	}
	/**
	 * 添加
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addUser(@RequestBody User user){
		User u = userSevice.save(user);
		if(u!=null){
			//
		}
		return "ok";
	}
	
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public void delete(HttpServletRequest request, @PathVariable Long id){
		userSevice.delete(id);
	}
}
