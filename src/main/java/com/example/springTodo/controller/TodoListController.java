package com.example.springTodo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.springTodo.service.TodoService;



@RestController
public class TodoListController {
	
	@Autowired
	private TodoService todoService;
	
	//

}
