package com.project.questapp.requests;


import lombok.Data;
import org.hibernate.query.criteria.internal.ValueHandlerFactory;

@Data
public class PostCreateRequest {
    Long id;
    String text;
    String title;
    Long userId;
}
