package com.example.taskmanager.controller;

import com.example.taskmanager.service.TaskRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    TaskRepositoryService taskRepositoryService;

    @RequestMapping("/task-manager")
    public String indexController(Model model) {
        model.addAttribute("tasks", taskRepositoryService.getTaskList());
        return "task-manager";
    }
}
