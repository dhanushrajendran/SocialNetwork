package com.example.api.socialnetwork.service;
import com.example.api.socialnetwork.model.Relation;
import com.example.api.socialnetwork.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RelationService {
    @Autowired
    private RelationRepository relationRepository;
    public List<Relation> getAllRelation() {
        return (List<Relation>) relationRepository.findAll();
    }


    public Relation getRelationById(Long id) {
        return relationRepository.findById(id).orElse(null);
    }

    public Relation createRelation(Relation relation) {
        return relationRepository.save(relation);
    }

    public void deleteRelationByrelationId(Long relationId) {
        relationRepository.deleteById(relationId);
    }


}
