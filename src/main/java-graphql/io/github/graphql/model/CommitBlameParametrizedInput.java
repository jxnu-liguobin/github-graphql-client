package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field blame in type Commit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitBlameParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String path;

    public CommitBlameParametrizedInput() {
    }

    public CommitBlameParametrizedInput(String path) {
        this.path = path;
    }

    public CommitBlameParametrizedInput path(String path) {
        this.path = path;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        return joiner.toString();
    }

}
