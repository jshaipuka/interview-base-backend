package graphql.models;

public class Tag {

    public String id;
    public String name;
    public int count;

//    public List<Company> companies;
//    public List<Role> roles;
//    public List<Question> questions;
    public boolean hidden;

    public Tag(String name, int count){
        this(null, name, count);
    }

    public Tag(String id, String name, int count){
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

    public boolean isHidden() { return hidden;}

    @Override
    public String toString() {
        return String.format(
                "Tag[id=%s, firstName='%s']",
                id, name);
    }
}
