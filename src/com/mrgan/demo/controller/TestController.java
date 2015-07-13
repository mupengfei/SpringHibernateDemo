package com.mrgan.demo.controller;

import java.io.IOException;
import java.io.Writer;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mrgan.demo.services.VideosService;

@Controller
@RequestMapping("/")
public class TestController {

	@Resource(name = "videosService")
	private VideosService service;

	@ModelAttribute
	public Model init(Model model) {
		System.out.println("init");
		model.addAttribute("init", "ok");
		return model;
	}

	@RequestMapping(value = "test.do", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String hello2() {
		System.out.println(service.videosCount());
		return "<h1>Hello World</h1>";
	}

	@RequestMapping(value = "{num}", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String getInt(@PathVariable Double num) {
		System.out.println(service.videosCount());
		return "1";
	}

	@RequestMapping(value = "something", method = RequestMethod.GET)
	public void handle(
			@RequestParam(value = "body", required = false) String body,
			Writer writer) throws IOException {
		System.out.println(1);
		writer.write(body);
	}

	@RequestMapping(value = "testmodel", method = RequestMethod.GET)
	@ResponseBody
	public String modelTest(Model model) {
		return "model";
	}
}
