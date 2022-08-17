package com.example.kakaoMap_API.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mapController {
	
	@GetMapping("/") 
	public String basicMap() {
		System.out.println("카카오맵 API 테스트");
		
		return "basicMap";
	}

	/*@GetMapping("/address") 
	public String address() {
		System.out.println("카카오 API 테스트");
		
		return "address";
	}
	
	
	@GetMapping("/abc") 
	public String findByAddress() {
		System.out.println("카카오 API 테스트");
		
		return "abc";
	}
	*/
}


