package com.example.mychat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "messages")
public class Message extends BaseModel {
    @OneToOne
    private User sender;
    @OneToOne
    private User receiver;
    private String content;
    private LocalDateTime sentAt;
}
