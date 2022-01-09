package com.ramos.todoapp.service;

import com.ramos.todoapp.data.dto.TodoDto;

import java.util.List;

public interface TodoService {
    List<TodoDto> getTodos() throws Exception;

    Long postTodo(TodoDto todoDto) throws Exception;

    void deleteTodo(Long id) throws Exception;

    TodoDto findTodoById(Long id) throws Exception;
}
