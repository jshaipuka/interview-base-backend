package graphql.repository;

import com.mongodb.client.MongoCollection;
import graphql.models.Tag;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class TagRepository {

    private final MongoCollection<Document> tags;

    public TagRepository(MongoCollection<Document> tags) {
        this.tags = tags;
        this.save(new Tag(null, "some tag", 1));
        this.save(new Tag(null, "some tag3", 2));
    }

    public Tag findById(String id) {
        Document doc = tags.find(eq("_id", new ObjectId(id))).first();
        return Tag(doc);
    }

    public List<Tag> getAllTags() {
        List<Tag> allTags = new ArrayList<>();
        for (Document doc : tags.find()) {
            allTags.add(Tag(doc));
        }
        return allTags;
    }

    private Tag Tag(Document doc) {
        return new Tag(
                doc.get("_id").toString(),
                doc.getString("name"),
                doc.getInteger("count"));
    }

    //sampleData
    public void save(Tag tag) {
        Document doc = new Document();
        doc.append("name", tag.getName());
        doc.append("count", tag.getCount());
        tags.insertOne(doc);
    }
}