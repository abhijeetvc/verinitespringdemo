package com.verinitesp.verinitespdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController    // @Controller + @ResponseBody
//@RequestMapping("/start")
@SpringBootApplication
public class VerinitespringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerinitespringdemoApplication.class, args);
	}

//	@GetMapping("/getdata")
//	public String check() {
//		return "Hello Spring";
//	}
//	
//	
//	@GetMapping("/add/{a}/{b}")
//	public Integer addNos(@PathVariable Integer a,
//						  @PathVariable Integer b) {
//		return a+b;
//	}
}
