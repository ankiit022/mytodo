package todo.service;

import org.springframework.stereotype.Service;
@Service
public class TodoService {

	int s=10;
	int b=20;
	
	int c=s+b;
	
	public int sum() {
		return c;
	}

}


