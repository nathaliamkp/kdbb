package com.kdbb.usermanagement.repository;

import com.kdbb.usermanagement.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long>{
}
