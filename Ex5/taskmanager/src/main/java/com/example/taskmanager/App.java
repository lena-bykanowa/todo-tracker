package com.example.taskmanager;

import com.example.taskmanager.domain.Task;
import com.example.taskmanager.domain.TaskCategory;
import com.example.taskmanager.json.JsonProcessing;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<Task> tasks = new ArrayList<>();

        Task task1 = new Task("test", TaskCategory.STUDY, 1, LocalDate.parse("2022-10-10"));
        Task task2 = new Task("test2", TaskCategory.WORK, 2, LocalDate.parse("2022-10-10"));

        ArrayList<Task> list = new ArrayList<>();
        list.add(task1);
        list.add(task2);

        JsonProcessing.serialize(list);

        ArrayList<Task> deserializedList = JsonProcessing.deserialize();
        deserializedList.forEach(System.out::println);
    }
}
