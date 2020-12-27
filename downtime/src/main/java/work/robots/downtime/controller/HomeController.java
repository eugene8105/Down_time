package work.robots.downtime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import work.robots.downtime.entity.Problem;
import work.robots.downtime.service.ProblemService;
import work.robots.downtime.service.ResourceListService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
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
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = currentDateTime.format(format);
        model.addAttribute("problem", problem);
        // saving an Problem object inside of database
        problem.setDate(formatDateTime);
        problemService.saveProblem(problem);

        model.addAttribute("pageTitle", "Your input was successful");

        return "submitted";
    }

}
