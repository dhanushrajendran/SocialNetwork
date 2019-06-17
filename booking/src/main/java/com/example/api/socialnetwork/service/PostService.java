package com.example.api.socialnetwork.service;

import com.example.api.socialnetwork.model.Posts;
import com.example.api.socialnetwork.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public List<Posts> getAllPosts() {
        return (List<Posts>) postRepository.findAll();
    }


    public Posts getPostsById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Posts createPost(Posts posts) {
        return postRepository.save(posts);
    }

    public void deletePostsBypostsId(Long postsId) {
        postRepository.deleteById(postsId);
    }
}


