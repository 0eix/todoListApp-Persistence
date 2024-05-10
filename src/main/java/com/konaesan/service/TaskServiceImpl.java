package com.konaesan.service;

import com.konaesan.domain.Task;
import com.konaesan.repository.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService
{
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list()
    {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task)
    {
        return taskRepository.save(task);
    }
}
