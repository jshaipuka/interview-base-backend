package lv.jelena.base.interview.model;

import java.util.List;

public class Role {

    private String id;

    private String name;
    private String description;
    private List<Company> companies;
    private List<Question> questions;
    private List<Tag> tags;

    private int difficulty;

    private boolean hidden;
    private boolean draft;
    private String createdTime;
    private String updatedTime;

    private List<String> relatedIds;

    public Role(String name, String description) {
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
