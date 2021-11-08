package com.ramos.todoapp.data.dto;


import com.ramos.todoapp.data.entity.TodoEntity;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TodoDto {
    private Long todoId;
    private String contents;
    private LocalDateTime createdDateTime;
    private Boolean isCompleted;

    public TodoEntity toEntity() {
        return TodoEntity.builder()
                .todoId(todoId)
                .contents(contents)
                .createdDateTime(createdDateTime)
                .isCompleted(isCompleted)
                .build();
    }
}
