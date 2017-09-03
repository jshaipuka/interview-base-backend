package graphql;

import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import graphql.repository.TagRepository;
import graphql.schema.GraphQLSchema;

import graphql.servlet.SimpleGraphQLServlet;

@WebServlet(urlPatterns = "/interview")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    private static final TagRepository tagRepository;

    static {
        MongoDatabase mongo = new MongoClient().getDatabase("interview-base");
        tagRepository = new TagRepository(mongo.getCollection("tags"));
    }

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(tagRepository), new Mutation(tagRepository))
                .build()
                .makeExecutableSchema();
    }
}