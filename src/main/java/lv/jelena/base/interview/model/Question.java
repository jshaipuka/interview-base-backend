package lv.jelena.base.interview.model;


import java.util.List;

public class Question {

    private String id;

    private String question;
    private String answer;
    private List<Company> companies;
    private List<Role> roles;
    private List<Tag> tags;

    private int difficulty;
    private int frequentlyAsked;

    private boolean hidden;
    private boolean draft;
    private String createdTime;
    private String updatedTime;

    private List<String> relatedIds;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return String.format(
                "question[id=%s, firstName='%s', lastName='%s']",
                id, question, answer);
    }
}
