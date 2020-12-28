package work.robots.downtime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.robots.downtime.dto.ProblemRepository;
import work.robots.downtime.entity.Problem;

@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    @Override
    public void saveProblem(Problem problem) {
        problemRepository.save(problem);
    }

}
