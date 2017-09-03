package graphql.models;

import java.util.List;

public class Role {

    public String id;

    public String name;
    public String description;
    public List<Company> companies;
    public List<Question> questions;
    public List<Tag> tags;

    public int difficulty;

    public boolean hidden;
    public boolean draft;
    public String createdTime;
    public String updatedTime;

    public List<String> relatedIds;

    public Role(){}

    public Role(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Role[id=%s, firstName='%s', lastName='%s']",
                id, name, description);
    }
}
