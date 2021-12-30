package de.hhu.projectstodo.controllers;

import de.hhu.projectstodo.domain.Unternehmen;
import de.hhu.projectstodo.services.UnternehmenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UnternehmenController {

    private UnternehmenService service;

    public UnternehmenController(UnternehmenService service) {
        this.service = service;
    }

    @GetMapping("createunter")
    String getUnternehmenForm(Model model){
        model.addAttribute("unternehmen", new Unternehmen(null,null,null));
        return "unterForm";
    }

    @PostMapping("saveunter")
    String saveUnternehmen (Model model, @ModelAttribute("unternehmen") Unternehmen unternehmen){
        System.out.println(unternehmen);
//        service.saveUnternehmen(unternehmen);
        return "unterForm";
    }
}
