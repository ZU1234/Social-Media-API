package com.core.repository;

import com.core.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UserModelRepository extends CrudRepository<UserModel, Serializable> {
}