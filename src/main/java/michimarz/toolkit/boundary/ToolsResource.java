package michimarz.toolkit.boundary;

import java.net.URI;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import michimarz.toolkit.control.ToolsService;
import michimarz.toolkit.entity.Tool;

@Path("/tools")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
public class ToolsResource {

    @Inject
    ToolsService tools;

    @GET
    public List<Tool> getAllTools() {
        return tools.listAllTools();
    }

    @POST
    public Response create() {
        Tool tool = tools.createTool();
        return Response.created(URI.create("/tools/" + tool.id)).build();
    }

    

}
