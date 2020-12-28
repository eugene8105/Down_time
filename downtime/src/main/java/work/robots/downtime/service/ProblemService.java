package work.robots.downtime.service;

import org.springframework.stereotype.Service;
import work.robots.downtime.entity.Problem;

public interface ProblemService {
    void saveProblem(Problem problem);

}
