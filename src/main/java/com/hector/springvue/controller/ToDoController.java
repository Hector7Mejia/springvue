package com.hector.springvue.controller;

import com.hector.springvue.data.ToDo;
import com.hector.springvue.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    public List<ToDo> findAll() {
        return toDoService.findAll();
    }
    @GetMapping("/id")
    public ToDo findById(String id) {
        return toDoService.findById(id);
    }

}
