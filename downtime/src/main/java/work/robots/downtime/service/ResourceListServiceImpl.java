package work.robots.downtime.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.robots.downtime.entity.Resource;
import work.robots.downtime.dto.ResourceRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceListServiceImpl implements ResourceListService {

    @Autowired
    private ResourceRepository resourceRepository;

    @Override
    // puling resources from the database and setting up in the list and returning that list
    public List<Resource> getResources() {
        List<Resource> resourceList = new ArrayList<>();
        resourceRepository.findAll().forEach(resourceList::add);
        return resourceList;
    }
}
