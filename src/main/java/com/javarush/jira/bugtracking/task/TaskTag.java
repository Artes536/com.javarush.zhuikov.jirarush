package com.javarush.jira.bugtracking.task;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "task_tag", uniqueConstraints = @UniqueConstraint(columnNames = {"task_id", "tag"}))
@Getter
@Setter
public class TaskTag {

    @EmbeddedId
    private TaskTagId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("taskId")
    @JoinColumn(name = "task_id")
    private Task task;

    @Column(name = "tag", nullable = false, length = 32, insertable = false, updatable = false)
    private String tag;

    public TaskTag() {}

    public TaskTag(Task task, String tag) {
        this.task = task;
        this.tag = tag;
        this.id = new TaskTagId();
        this.id.setTaskId(task.getId());
        this.id.setTag(tag);
    }

}
