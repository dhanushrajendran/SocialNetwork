package com.example.api.socialnetwork.repository;

import com.example.api.socialnetwork.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {



    User deleteUserByuserId(Long userId);
}
