package lv.jelena.base.interview.controller;

import lv.jelena.base.interview.manager.InterviewManager;
import lv.jelena.base.interview.model.Interview;
import lv.jelena.base.interview.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotificationController {

    private final InterviewManager interviewManager;

    @Autowired
    public NotificationController(final InterviewManager interviewManager) {
        this.interviewManager = interviewManager;
    }

    @GetMapping("/interviews")
    @ResponseBody
    public List<Interview> interviews() {
        return interviewManager.interviews();
    }

    @GetMapping("/interviews/{interviewId}/questions")
    @ResponseBody
    public List<Question> questions(@PathVariable("interviewId") final Long interviewId) {
        return interviewManager.questions(interviewId);
    }
}
