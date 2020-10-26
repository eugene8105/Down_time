package work.robots.downtime.dto;

import org.springframework.data.repository.CrudRepository;
import work.robots.downtime.entity.Resource;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {
}
