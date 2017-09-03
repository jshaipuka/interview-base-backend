package graphql.models;


import java.util.List;

public class Question {

    public String id;

    public String question;
    public String answer;
    public List<Company> companies;
    public List<Role> roles;
    public List<Tag> tags;

    public int difficulty;
    public int frequentlyAsked;

    public boolean hidden;
    public boolean draft;
    public String createdTime;
    public String updatedTime;

    public List<String> relatedIds;

    //comment

    public Question(){}

    public Question(String question, String answer){
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
