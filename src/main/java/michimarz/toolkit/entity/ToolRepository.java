package michimarz.toolkit.entity;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ToolRepository implements PanacheRepository<Tool> {
    
}
