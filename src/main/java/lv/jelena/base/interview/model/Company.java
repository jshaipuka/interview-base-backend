package lv.jelena.base.interview.model;

import java.util.List;

public class Company {

    private String id;
    private String icon;
    private String name;
    private String description;
    private List<Role> roles;
    private int questionCount;
    private List<Tag> tags;
    private boolean hidden;
    private boolean draft;
    private String createdTime;
    private String updatedTime;

    public Company(String name, String description) {
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
