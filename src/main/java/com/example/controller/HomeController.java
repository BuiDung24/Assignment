package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index.php")
	public String index(Model model) {
		model.addAttribute("message", "Chao mung ban den voi controller");
		return "index1";
	}

}
