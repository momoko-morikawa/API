package com.example.springTodo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springTodo.model.TodoList;

@Service
public class TodoService {
	
	//TodoListが沢山入ったリストを作成、３つやることを入れる
	private List<TodoList> allTodo = new ArrayList<>(Arrays.asList(
			new TodoList(1,"メールを送る","未着手","先生にメールする"), //TodoListコンストラクタ
			new TodoList(2,"お肉を買う","未着手","スーパーで買う"), //TodoListコンストラクタ
			new TodoList(3,"宿題をする","進行中","算数プリント") //TodoListコンストラクタ
			));
	
	//TODOの追加
	public void addTodo(TodoList todoList) {
		allTodo.add(todoList);
	}
}
