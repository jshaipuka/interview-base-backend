package lv.jelena.base.interview.model;

public class Tag {

    private String id;
    private String name;
    private int count;
    private boolean hidden;

    public Tag(String name, int count) {
        this(null, name, count);
    }

    private Tag(String id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public boolean isHidden() {
        return hidden;
    }

    @Override
    public String toString() {
        return String.format(
                "Tag[id=%s, firstName='%s']",
                id, name);
    }
}
