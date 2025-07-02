package com.javarush.jira.bugtracking.task;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskTagId implements Serializable {

    private Long taskId;
    private String tag;


}
