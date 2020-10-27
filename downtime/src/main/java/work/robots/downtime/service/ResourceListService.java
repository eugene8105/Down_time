package work.robots.downtime.service;

import org.springframework.stereotype.Service;
import work.robots.downtime.entity.Resource;

import java.util.List;

public interface ResourceListService {
    List<Resource> getResources();
}
