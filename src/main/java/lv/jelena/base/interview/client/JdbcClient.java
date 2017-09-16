package lv.jelena.base.interview.client;

import lv.jelena.base.interview.model.Interview;
import lv.jelena.base.interview.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcClient {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcClient(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Interview> interviews() {
        return jdbcTemplate.query("SELECT id, name FROM interview",
                (rs, i) -> new Interview(rs.getLong("id"), rs.getString("name")));
    }

    public List<Question> questions(final Long interviewId) {
        return jdbcTemplate.query("SELECT id, text, answer FROM question WHERE interview_id = ?",
                (rs, i) -> new Question(rs.getLong("id"), rs.getString("text"), rs.getString("answer")), interviewId);
    }
}
