package com.kafka.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home/")
public class IndexController {
	@RequestMapping(value = "index", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		return "hello world";
	}
}
