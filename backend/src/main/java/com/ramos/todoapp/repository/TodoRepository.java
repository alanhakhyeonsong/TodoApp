package com.ramos.todoapp.repository;

import com.ramos.todoapp.data.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
