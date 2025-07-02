package com.javarush.jira.bugtracking.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskTagRepository extends JpaRepository<TaskTag, TaskTagId> {
    List<TaskTag> findByTaskId(Long taskId);
}