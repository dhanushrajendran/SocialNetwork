package com.example.api.socialnetwork.repository;

import com.example.api.socialnetwork.model.Reactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactionsRepository extends CrudRepository <Reactions,Long> {
}
