package com.konaesan.repository;

import com.konaesan.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>
{
}
