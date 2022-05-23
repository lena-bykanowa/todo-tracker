package com.example.taskmanager.controller;

import com.example.taskmanager.domain.Task;
import com.example.taskmanager.service.TaskRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.io.IOException;

@Controller
public class TaskController {

    @Autowired
    TaskRepositoryService taskRepositoryService;

    @GetMapping("/add-new-task")
    public String addNewTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "add-new-task";
    }

    @PostMapping("/add-new-task")
    public String addNewTask(@Valid @ModelAttribute Task task, BindingResult result, Model model) throws IOException {

        if (result.hasErrors()) {
            return ("/add-new-task");
        }
        taskRepositoryService.addTask(task);
        model.addAttribute("tasks", taskRepositoryService.getTaskList());
        return "/task-manager";
    }
}
