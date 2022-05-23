package com.example.taskmanager.service;

import com.example.taskmanager.domain.Task;
import com.example.taskmanager.json.JsonProcessing;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@Component
public class TaskRepositoryService {

    public void addTask(Task task) throws IOException {
        ArrayList<Task> taskList = TaskRepository.getRepository();
        taskList.add(task);
        JsonProcessing.serialize(taskList);
    }

    public void deleteTask(String description) {
        Iterator<Task> iterator = TaskRepository.getRepository().iterator();
        while(iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getDescription() == description) {
                iterator.remove();
            }
        }
    }

    public ArrayList<Task> getTaskList() {
        return TaskRepository.getRepository();
    }
}
