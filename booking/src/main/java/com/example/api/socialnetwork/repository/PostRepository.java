package com.example.api.socialnetwork.repository;

import com.example.api.socialnetwork.model.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface PostRepository extends CrudRepository<Posts,Long> {
    }

