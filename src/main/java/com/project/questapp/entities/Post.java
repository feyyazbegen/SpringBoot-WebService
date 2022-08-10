package com.project.questapp.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="post")
@Data
public class Post {
    @Id
    Long id;

    // Hibernate
    @ManyToOne(fetch = FetchType.LAZY)  // User objesini DB'den hemen çekm
    @JoinColumn(name="user_id",nullable = false) //  Post Db içindeki user_id'ye bağladık
    @OnDelete(action = OnDeleteAction.CASCADE) //  Bir User silinince tüm Post'ları silinir
    @JsonIgnore // Serileştirme işleminde problem çıkarmaması için ekledik
    User user;
    /////
    String title;
    @Lob
    @Column(columnDefinition = "text")
    String text;

}
