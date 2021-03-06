package lv.jelena.base.interview.model;


public class Question {

    private Long id;
    private String title;
    private String text;
    private String answer;

    public Question(Long id, String title, String text, String answer) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(final String answer) {
        this.answer = answer;
    }
}
