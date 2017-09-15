package lv.jelena.base.interview.workflow;

import lv.jelena.base.interview.client.JdbcClient;
import lv.jelena.base.interview.model.Notification;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class CreateNotificationWorkflow {

    private static final Logger logger = getLogger(CreateNotificationWorkflow.class);

    private final JdbcClient jdbcClient;

    @Autowired
    public CreateNotificationWorkflow(final JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void createEvent(final Notification notification) {
        logger.info("Going to create event for " + notification);
        jdbcClient.createEvent(notification);
    }
}
