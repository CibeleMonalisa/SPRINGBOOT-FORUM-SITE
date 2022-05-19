package br.com.alura.forum.controller;
//é importante colocar o @Controller para o Spring boot gerenciar a classe
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}
}
