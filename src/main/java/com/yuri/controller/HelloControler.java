package com.yuri.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

//"@RestController" uma anotação que torna a classe uma controller como "@Controller" 
//e faz todos os métodos devolverem objetos json ou xml, sem haver a necessidade de anotar 
//individualmente a assinatura de cada método com "@ResponseBody" 
@RestController
@RequestMapping("/api/hello")
public class HelloControler {
	
	@RequestMapping(method = GET)
	public String hello() {
		return "Hello!, World!!!";
	}

}
