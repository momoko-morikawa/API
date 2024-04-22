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
			new TodoList("1001","メールを送る","未着手","先生にメールする"), 
			new TodoList("1002","お肉を買う","未着手","スーパーで買う"), 
			new TodoList("1003","宿題をする","進行中","算数プリント"), 
			new TodoList("1004","宿題をする","進行中","漢字プリント"),
			new TodoList("1005","宿題をする","完了","自主学習")
			));
	
	//TODOの追加
	public void addTodo(TodoList todoList) {
		allTodo.add(todoList);
	}
	
	//全取得機能
	public List<TodoList> getAll(){
		return allTodo;
	}
	
	//タスクを一個だけ取得
	public TodoList getTodo(String id) {
		for(int i = 0; i < allTodo.size(); i++) {
			if(allTodo.get(i).getId().equals(id)) {
				return (TodoList)allTodo.get(i);
			}
		}
		return null;
	}
	
	//タスクを一件削除
	public void deleteTodo(String id) {
		for(int i = 0; i < allTodo.size(); i++) {
			if(allTodo.get(i).getId().equals(id)) {
				allTodo.remove(i);
			}
		}
	}
	
	//更新機能
	public void updateTodo(String id,TodoList todoList) {
		for(int i = 0; i < allTodo.size(); i++) {
			if(allTodo.get(i).getId().equals(id)) {
				allTodo.set(i, todoList);
			}
		}
	}
	
	//フィルタリング機能ステータスで絞り込み
	public List<TodoList> findByStatus(String status) {
		for(int i = 0; i < allTodo.size(); i++) {
			if(allTodo.get(i).getStatus().equals(status)) {
				return (List<TodoList>) allTodo.get(i);
			}
		}
		return null;
	}
}
