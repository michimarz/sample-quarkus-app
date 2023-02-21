package michimarz.toolkit.control;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import michimarz.toolkit.entity.Tool;
import michimarz.toolkit.entity.ToolRepository;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;

@ApplicationScoped
public class ToolsService {
    
    @Inject
    ToolRepository repository;

    public List<Tool> listAllTools() {
        return repository.listAll();
    }

    @Transactional
    public Tool createTool() {
        Tool tool = new Tool();
        tool.name = "test tool";
        tool.stage = "beginner";
        repository.persist(tool);
        return tool;
    }

}
