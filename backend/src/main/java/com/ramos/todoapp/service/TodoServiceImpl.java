package com.ramos.todoapp.service;

import com.ramos.todoapp.data.dto.TodoDto;
import com.ramos.todoapp.data.entity.TodoEntity;
import com.ramos.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository repository;

    @Override
    public List<TodoDto> getTodos() throws Exception {
        List<TodoEntity> entityList = repository.findAll();
        List<TodoDto> dtoList = new ArrayList<>();
        for (TodoEntity entity : entityList) {
            dtoList.add(entity.toDto());
        }
        return dtoList;
    }

    @Override
    @Transactional
    public Long postTodo(TodoDto todoDto) throws Exception {
        return repository.save(todoDto.toEntity()).getTodoId();
    }

    @Override
    @Transactional
    public void deleteTodo(Long id) throws Exception {
        repository.deleteById(id);
    }

    @Override
    public TodoDto findTodoById(Long id) throws Exception {
        return repository.findById(id).orElseThrow().toDto();
    }
}
