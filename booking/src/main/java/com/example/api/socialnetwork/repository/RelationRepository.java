package com.example.api.socialnetwork.repository;

import com.example.api.socialnetwork.model.Relation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationRepository extends CrudRepository <Relation,Long> {
}
