package com.verinitesp.verinitespdemo.impl;

import org.springframework.stereotype.Component;

import com.verinitesp.verinitespdemo.repository.MyInterface;

@Component
public class MyImpl implements MyInterface{

	@Override
	public String getData() {
		
		return "Hello Spring...";
	}
	
	
	public String getData1() {
		return "Hello Spring Program";
	}

}
