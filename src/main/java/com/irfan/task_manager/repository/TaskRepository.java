package com.irfan.task_manager.repository;

import com.irfan.task_manager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // 1. Tells Spring this is a Repository
public interface TaskRepository extends JpaRepository<Task, Long> { // 2. The magic
    // That's it. For now.
}