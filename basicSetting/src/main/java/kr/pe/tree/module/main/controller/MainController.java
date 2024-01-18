package kr.pe.tree.module.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
