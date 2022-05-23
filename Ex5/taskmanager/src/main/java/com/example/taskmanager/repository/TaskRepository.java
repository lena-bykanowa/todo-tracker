package com.example.taskmanager.repository;

import com.example.taskmanager.domain.Task;
import com.example.taskmanager.domain.TaskCategory;
import com.example.taskmanager.json.JsonProcessing;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private static ArrayList<Task> taskRepository = new ArrayList<>();

    public static ArrayList<Task> getRepository() {
        taskRepository = JsonProcessing.deserialize();
        return taskRepository;
    }
}
