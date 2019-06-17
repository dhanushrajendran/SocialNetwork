package com.example.api.socialnetwork.web;

import com.example.api.socialnetwork.model.Posts;
import com.example.api.socialnetwork.model.Reactions;

import com.example.api.socialnetwork.model.User;
import com.example.api.socialnetwork.repository.ReactionsRepository;

import com.example.api.socialnetwork.service.ReactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class ReactionsController {
    @Autowired

    private ReactionsService reactionsService;

    @RequestMapping(value = "/reactions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reactions> getReactions() {
        return (List<Reactions>) reactionsService.getAllReactions();

    }

    @RequestMapping(value = "/reactions/{reactionsId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> deleteReactionsByreactionId(@PathVariable("reactionsId") Long reactionsId) {
        reactionsService.deleteReactionsByreactionsId(reactionsId);
        return ResponseEntity.noContent().header("message", "reactions deleted").build();
    }

    @RequestMapping(value = "/reactions", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Reactions> createreactions(@RequestBody Reactions reactions) {
        Reactions createdReactions = reactionsService.createReactions(reactions);
        return Optional.ofNullable(createdReactions)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/reactions", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Reactions> createReactions(@RequestBody Reactions reactions) {
        Reactions createdReactions = reactionsService.createReactions(reactions);
        return Optional.ofNullable(createdReactions)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }
}