package com.example.taskmanager.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class Task {

    @Size(min=3, message="{validation.name}")
    public String description;

    public TaskCategory category;

    public Integer priority;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Future(message = "{validation.date}")
    @NotNull(message = "{validation.date.is.null}")
    public LocalDate due;


    public Task() {
    }

    public Task(String description, TaskCategory category, Integer priority, LocalDate due) {

        this.description = description;
        this.category = category;
        this.priority = priority;
        this.due = due;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public void setCategory(TaskCategory category) {
        this.category = category;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public LocalDate getDue() {
        return due;
    }

    public void setDue(LocalDate due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", category=" + category +
                ", priority=" + priority +
                ", due=" + due +
                '}';
    }
}