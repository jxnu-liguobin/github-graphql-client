package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field shortDescriptionHTML in type RepositoryInfo
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryInfoShortDescriptionHTMLParametrizedInput implements GraphQLParametrizedInput {

    private Integer limit = 200;

    public RepositoryInfoShortDescriptionHTMLParametrizedInput() {
    }

    public RepositoryInfoShortDescriptionHTMLParametrizedInput(Integer limit) {
        this.limit = limit;
    }

    public RepositoryInfoShortDescriptionHTMLParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (limit != null) {
            joiner.add("limit: " + GraphQLRequestSerializer.getEntry(limit));
        }
        return joiner.toString();
    }

}
