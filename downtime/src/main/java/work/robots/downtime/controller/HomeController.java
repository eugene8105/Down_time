package work.robots.downtime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import work.robots.downtime.entity.Problem;
import work.robots.downtime.service.ProblemService;
import work.robots.downtime.service.ResourceListService;

public class HomeController {

    @Autowired
    private ResourceListService resourceListService;

    @Autowired
    private ProblemService problemService;

    @GetMapping("/")
    public String showMainForm(Model model) {
        // passing title name to the model
        model.addAttribute("pageTitle", "Robot down time error collector");
        // passing resource name list to the model from database
        model.addAttribute("resourceList", resourceListService.getResources());
        // filling the data from the form in a Problem entity
        model.addAttribute("problem", new Problem());
        return "index";
    }

    @PostMapping("/")
    public String postShowMainPage(@ModelAttribute Problem problem, Model model) {
        model.addAttribute("problem", problem);
        // saving an Problem object inside of database
        problemService.saveProblem(problem);
        return "index";
    }
}
