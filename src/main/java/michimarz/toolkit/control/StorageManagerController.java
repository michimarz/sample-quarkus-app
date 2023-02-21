package michimarz.toolkit.control;

import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class StorageManagerController {
    private static final Logger LOG = Logger.getLogger( StorageManagerController.class.getName() );

// 6    @ConfigProperty(name = "microstream.db.postgres.url")
// 7    String dbUrl;
// 8    @ConfigProperty(name = "microstream.db.postgres.user")
// 9    String dbUser;
// 10    @ConfigProperty(name = "microstream.db.postgres.password")
// 11    String dbPassword;

    public void onStartup(@Observes StartupEvent startupEvent) {
        LOG.info("Initializing MicroStream in-memory storage...");

        //StorageManagerAccessor.init(this.dbUrl, this.dbUser, this.dbPassword);
    }

    public void onShutdown(@Observes ShutdownEvent shutdownEvent) {
        LOG.info("Shutting down MicroStream in-memory storage...!!!");
//       StorageManagerAccessor.getInstance().shutdown();
    }
}
