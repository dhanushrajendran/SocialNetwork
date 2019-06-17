package com.example.api.socialnetwork.web;

import com.example.api.socialnetwork.model.Reactions;

import com.example.api.socialnetwork.repository.ReactionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ReactionsController {
    @Autowired

    private ReactionsRepository reactionsRepository;

    @RequestMapping(value = "/reactions", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Reactions> getAllReactions() {
        return (List<Reactions>) reactionsRepository.findAll();

    }
}
