package com.locationweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LocationController {

	
	@RequestMapping("/divyaraj1")
	public String maven1() {
		return "index1"; 
	}
	
	@RequestMapping("/divyaraj2")
	public String maven2() {
		return "index2"; 
	}
	
	
	}

