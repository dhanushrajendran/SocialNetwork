package com.example.api.socialnetwork.web;


import com.example.api.socialnetwork.model.Relation;
import com.example.api.socialnetwork.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RelationController {
    @Autowired
    private RelationService relationService;

    @RequestMapping(value = "/relation", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Relation> getAllRelation() {
        return (List<Relation>) relationService.getAllRelation();
    }


    @RequestMapping(value = "/relation/{relationId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> deleteRelationByrelationId(@PathVariable("relationId") Long relationId) {
        relationService.deleteRelationByrelationId(relationId);
        return ResponseEntity.noContent().header("message", "relation deleted").build();
    }

    @RequestMapping(value = "/relation", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Relation> createrelation(@RequestBody Relation relation) {
        Relation createdRelation = relationService.createRelation(relation);
        return Optional.ofNullable(createdRelation)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/relation", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Relation> createRelation(@RequestBody Relation relation) {
        Relation createdRelation = relationService.createRelation(relation);
        return Optional.ofNullable(createdRelation)
                .map(u -> ResponseEntity.ok().body(u))
                .orElse(ResponseEntity.notFound().build());
    }
}