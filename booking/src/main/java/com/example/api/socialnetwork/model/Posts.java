package com.example.api.socialnetwork.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="[posts]")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String postType;
    private String postText;
    private String postLocation;
    private LocalDateTime postdate;


    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostLocation() {
        return postLocation;
    }

    public void setPostLocation(String postLocation) {
        this.postLocation = postLocation;
    }

    public LocalDateTime getPostdate() {
        return postdate;
    }

    public void setPostdate(LocalDateTime postdate) {
        this.postdate = postdate;
    }



}