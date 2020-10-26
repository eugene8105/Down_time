package work.robots.downtime.dto;

import org.springframework.data.repository.CrudRepository;
import work.robots.downtime.entity.Problem;

public interface ProblemRepository extends CrudRepository<Problem, Integer> {
}
