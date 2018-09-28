package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//注释8888
@Controller
public class HelloworldController {

	@ResponseBody
	@RequestMapping("hello")
	public String helloworld() {
		return "helloworld!";
	}
}
