package graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import graphql.models.Tag;
import graphql.repository.TagRepository;

public class Mutation implements GraphQLRootResolver {

    private final TagRepository tagRepository;

    public Mutation(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public Tag createTag(String name, int count) {
        Tag newTag = new Tag(name, count);
        tagRepository.save(newTag);
        return newTag;
    }
}