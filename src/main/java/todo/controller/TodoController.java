package todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.service.TodoService;


@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService service;
	
	@GetMapping("/hitodo")
	public String getTodoIntro() {
		return "Hi I am todo list";
	}
	
	
	@GetMapping("/mysum")
	public int sum() {
		return service.sum();
	}
	
	

}
