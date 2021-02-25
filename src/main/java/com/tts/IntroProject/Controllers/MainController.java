package com.tts.IntroProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/tts")
	public String tts() {
		return "index";
	}
	
	@RequestMapping("/glob")
	public String glob() {
		return "index2";
	}
}
