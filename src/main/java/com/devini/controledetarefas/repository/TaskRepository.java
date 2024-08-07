package com.devini.controledetarefas.repository;

import com.devini.controledetarefas.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository  extends JpaRepository<Task,Long> {
    List<Task> findByUsername(String username);
    List<Task> findByUsernameAndCompleted(String username, boolean completed);

}
