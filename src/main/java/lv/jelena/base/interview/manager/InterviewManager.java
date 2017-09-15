package lv.jelena.base.interview.manager;

import lv.jelena.base.interview.client.JdbcClient;
import lv.jelena.base.interview.model.Interview;
import lv.jelena.base.interview.model.Question;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@Component
public class InterviewManager {

    private static final Logger logger = getLogger(InterviewManager.class);

    private final JdbcClient jdbcClient;

    @Autowired
    public InterviewManager(final JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Interview> interviews() {
        return jdbcClient.interviews();
    }

    public List<Question> questions(final Long interviewId) {
        logger.info("Going to retrieve questions for interview with ID " + interviewId);
        return jdbcClient.questions(interviewId);
    }
}
