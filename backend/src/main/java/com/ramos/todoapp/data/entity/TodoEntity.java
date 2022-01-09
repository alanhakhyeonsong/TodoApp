package com.ramos.todoapp.data.entity;


import com.ramos.todoapp.data.dto.TodoDto;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "todo")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;

    @Column(nullable = false)
    private String contents;

    @Column(nullable = false)
    private LocalDateTime createdDateTime;

    @Column(nullable = false)
    @ColumnDefault("false")
    private Boolean isCompleted;

    public TodoDto toDto() {
        return TodoDto.builder()
                .todoId(todoId)
                .contents(contents)
                .createdDateTime(createdDateTime)
                .isCompleted(isCompleted)
                .build();
    }
}