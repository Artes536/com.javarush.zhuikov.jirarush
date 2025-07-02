package com.javarush.jira.bugtracking.task.to;

import java.io.Serializable;
import java.util.Objects;

public class TaskTagId implements Serializable {

    private Long taskId;
    private String tag;

    public TaskTagId(Long taskId, String tag) {
        this.taskId = taskId;
        this.tag = tag;
    }

    public TaskTagId() {
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskTagId)) return false;
        TaskTagId that = (TaskTagId) o;
        return Objects.equals(taskId, that.taskId) &&
                Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, tag);
    }

}
