package com.ramos.todoapp.controller;

import com.ramos.todoapp.data.dto.TodoDto;
import com.ramos.todoapp.service.TodoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoServiceImpl todoService;

    //전체 조회
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTodos() throws Exception {
        List<TodoDto> dtoList = todoService.getTodos();
        return ResponseEntity.ok(dtoList);
    }

    //등록
    @PostMapping
    public ResponseEntity<String> postTodo(@RequestBody TodoDto todoDto) throws Exception {
        todoDto.setCreatedDateTime(LocalDateTime.now());
        todoDto.setIsCompleted(false);
        todoService.postTodo(todoDto);
        return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
    }

    //수정
    @PutMapping("/{id}")
    public ResponseEntity<String> putTodo(@PathVariable("id") Long id) throws Exception {
        TodoDto todoDto = todoService.findTodoById(id);
        Boolean isCompleted = todoDto.getIsCompleted();
        todoDto.setIsCompleted(!isCompleted);
        todoService.postTodo(todoDto);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    //삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") Long id) throws Exception {
        todoService.deleteTodo(id);
        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    //단일 조회
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getTodo(@PathVariable("id") Long id) throws Exception {
        TodoDto todo = todoService.findTodoById(id);
        return ResponseEntity.ok(todo);
    }
}
