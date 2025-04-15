package com.lucardo.taskman.repository;

import com.lucardo.taskman.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
