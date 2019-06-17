package com.example.api.socialnetwork.web;
import com.example.api.socialnetwork.model.Posts;
import com.example.api.socialnetwork.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postsService;

    @RequestMapping(value = "/posts", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Posts> createdPosts(@RequestBody Posts posts) {
        Posts createdPosts = postsService.createPost(posts);
        return Optional.ofNullable(createdPosts)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }


    @RequestMapping(value = "/posts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Posts> getPosts() {
        return postsService.getAllPosts();
    }

    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Posts getPostsById(@PathVariable long id) {
        return postsService.getPostsById(id);
    }


    @RequestMapping(value = "/posts/{postsId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> deletePostsBypostsId(@PathVariable("postsId") Long postsId) {
        postsService.deletePostsBypostsId(postsId);
        return ResponseEntity.noContent().header("message", "posts deleted").build();
    }

    @RequestMapping(value = "/posts", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Posts> createposts(@RequestBody Posts posts) {
        Posts createdPosts = postsService.createPost(posts);
        return Optional.ofNullable(createdPosts)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }
}