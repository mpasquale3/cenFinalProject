
package com.example.todo.service;

import com.example.todo.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task addTask(String description) {
        Task task = new Task(idCounter.incrementAndGet(), description);
        tasks.add(task);
        return task;
    }

    public boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

}
