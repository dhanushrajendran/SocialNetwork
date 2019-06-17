package com.example.api.socialnetwork.service;


import com.example.api.socialnetwork.model.Reactions;

import com.example.api.socialnetwork.repository.ReactionsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactionsService {
    @Autowired
    private ReactionsRepository reactionsRepository;
    public List<Reactions> getAllReactions() {
        return (List<Reactions>) reactionsRepository.findAll();
    }


    public Reactions getReactionsById(Long id) {
        return reactionsRepository.findById(id).orElse(null);
    }

    public Reactions createReactions(Reactions reactions){
        return reactionsRepository.save(reactions);
    }
}


