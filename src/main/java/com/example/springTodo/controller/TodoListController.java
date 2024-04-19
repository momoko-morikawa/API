package com.example.springTodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springTodo.model.TodoList;
import com.example.springTodo.service.TodoService;



@RestController
public class TodoListController {
	
	@Autowired
	private TodoService todoService;
	
	//TODOの追加
	@PostMapping("/todos")
	public void addTodo(@RequestBody TodoList todoList) {
		todoService.addTodo(todoList);
	}
	
	//全件取得
	@GetMapping("/todos")
	public List<TodoList> getAll(){
		return todoService.getAll();
	}
	
	//一件取得
	@GetMapping("/todos/{id}")
	public TodoList getTodo(@PathVariable("id") int id) {
		return todoService.getTodo(id);
	}
	
	@DeleteMapping("/todos/{id}")
	public void deleteTodo(@PathVariable("id") int id) {
		todoService.deleteTodo(id);
	}
	
	@PutMapping("/todos/{id}")
	public void updateTodo(@PathVariable("id") int id, @RequestBody TodoList todoList) {
		todoService.updateTodo(id, todoList);
	}

}
