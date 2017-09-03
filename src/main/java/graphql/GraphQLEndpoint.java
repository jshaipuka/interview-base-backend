package graphql;

import com.coxautodev.graphql.tools.SchemaParser;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import graphql.repository.TagRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/interview")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    private static final TagRepository tagRepository;

    static {
        final MongoDatabase mongo =
                new MongoClient("91.92.128.214", 27017).getDatabase("interview-base");
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