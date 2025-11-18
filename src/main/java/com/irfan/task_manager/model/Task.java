package com.irfan.task_manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 1. This class is a database table
public class Task {

    @Id // 2. This field is the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 3. Let the DB auto-generate this ID
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    // 4. JPA needs a no-arg constructor
    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}