package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field release in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryReleaseParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String tagName;

    public RepositoryReleaseParametrizedInput() {
    }

    public RepositoryReleaseParametrizedInput(String tagName) {
        this.tagName = tagName;
    }

    public RepositoryReleaseParametrizedInput tagName(String tagName) {
        this.tagName = tagName;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (tagName != null) {
            joiner.add("tagName: " + GraphQLRequestSerializer.getEntry(tagName));
        }
        return joiner.toString();
    }

}
