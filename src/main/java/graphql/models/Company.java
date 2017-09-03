package graphql.models;

import java.util.List;

public class Company {

    public String id;

    public String icon;
    public String name;
    public String description;
    public List<Role> roles;
    public int questionCount;
    public List<Tag> tags;

    public boolean hidden;
    public boolean draft;
    public String createdTime;
    public String updatedTime;

    public Company(){}

    public Company(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format(
                "Company[id=%s, firstName='%s', lastName='%s']",
                id, name, description);
    }
}
