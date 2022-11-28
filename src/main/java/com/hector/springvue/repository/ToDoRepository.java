package com.hector.springvue.repository;

import com.hector.springvue.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo,String> {

}
