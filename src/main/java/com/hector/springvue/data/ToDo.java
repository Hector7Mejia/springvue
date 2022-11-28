package com.hector.springvue.data;

import org.springframework.data.annotation.Id;

public class ToDo {
    @Id
    public String id;
    public String title;
    public Boolean completed;

    public ToDo(String title, Boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String GetId() {
        return id;
    }
    public String GetTitle() {
        return title;
    }
    public Boolean GetCompleted() {
        return completed;
    }
}
