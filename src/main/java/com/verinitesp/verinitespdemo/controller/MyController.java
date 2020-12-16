package com.verinitesp.verinitespdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verinitesp.verinitespdemo.impl.MyImpl;
import com.verinitesp.verinitespdemo.repository.MyInterface;

@RestController
public class MyController {
	
//	@Autowired   //Use spring's dependency injection facilities
//	private MyImpl myImpl;  //Field based Dependency Injection
	
	@Autowired
	private MyInterface myInterface;
	
//	public MyController(MyImpl myImpl) { //Constructor based DI
//		this.myImpl=myImpl;
//	}
//	
//	@Autowired
//	public void setMyImpl(MyImpl myImpl) {
//		this.myImpl = myImpl;
//	}
	
	@GetMapping("/check")
	public String check() {
		return myInterface.getData();
	}



}
