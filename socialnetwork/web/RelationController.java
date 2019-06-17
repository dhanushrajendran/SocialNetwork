package com.example.api.socialnetwork.web;

import com.example.api.socialnetwork.model.Relation;

import com.example.api.socialnetwork.repository.RelationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RelationController {
    @Autowired
    private RelationRepository relationRepository;

    @RequestMapping(value = "/relations", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Relation> getAllRelation() {
        return (List<Relation>) relationRepository.findAll();

    }
}