package graphql;

import java.util.List;
import com.coxautodev.graphql.tools.GraphQLRootResolver;
import graphql.models.Tag;
import graphql.repository.TagRepository;

public class Query implements GraphQLRootResolver {

    private final TagRepository tagRepository;

    public Query(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public List<Tag> allTags() {
        return tagRepository.getAllTags();
    }
}