package com.irfan.task_manager.controller;

import com.irfan.task_manager.model.Task;
import com.irfan.task_manager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks") // 1. Base URL for all methods in this class
public class TaskController {

    private final TaskService taskService;

    // 2. Inject the Service (The "Brain")
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // 3. GET /tasks - Fetch all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    // 4. POST /tasks - Create a new task
    @PostMapping
    public Task createTask(@RequestBody Task task) { // 5. Map JSON to Java Object
        return taskService.createTask(task);
    }
}