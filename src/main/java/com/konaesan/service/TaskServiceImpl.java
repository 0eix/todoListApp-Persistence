package com.konaesan.service;

import com.konaesan.domain.Task;
import com.konaesan.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TaskServiceImpl implements TaskService
{
    @Autowired
    private TaskRepository taskRepository;

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
