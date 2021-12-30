package de.hhu.projectstodo.controllers;

import de.hhu.projectstodo.domain.Project;
import de.hhu.projectstodo.services.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjectController {

    private ProjectService service;

    public ProjectController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("createproject")
    String getProjectForm (Model model){
        model.addAttribute("project", new Project());
        return "projectForm";
    }

    @PostMapping("saveproject")
    String saveProject(@ModelAttribute("project") Project project, Model model){
        System.out.println(project.toString());
        return "projectForm";
    }
}
