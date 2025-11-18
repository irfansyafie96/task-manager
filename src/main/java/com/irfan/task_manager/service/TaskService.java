package com.irfan.task_manager.service;

import com.irfan.task_manager.model.Task;
import com.irfan.task_manager.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 1. Tells Spring this class holds business logic
public class TaskService {

    private final TaskRepository taskRepository;

    // 2. CONSTRUCTOR INJECTION (The Magic)
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // 3. Our Business Methods

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        // We could add logic here, e.g., if(task.getTitle() == null)...
        return taskRepository.save(task);
    }

    // We'll add update/delete later
}