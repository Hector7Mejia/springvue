package com.hector.springvue.service;

import com.hector.springvue.Exception.EntityNotFoundException;
import com.hector.springvue.data.ToDo;
import com.hector.springvue.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {
    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }
    public ToDo findById(String id){
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public ToDo saveToDo(ToDo todo) {
        return toDoRepository.save(todo);
    }
    public void deleteToDo(String id) {
         toDoRepository.deleteById(id);
    }

}
