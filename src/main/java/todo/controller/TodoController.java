package todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	
	@GetMapping("/hitodo")
	public String getTodoIntro() {
		return "Hi I am todo list";
	}

}
