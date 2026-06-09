package com.dikshanta.chat.ChatApplication.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "messages")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Message {
    private String id;
    private String content;
    private LocalDateTime timestamp;
}
