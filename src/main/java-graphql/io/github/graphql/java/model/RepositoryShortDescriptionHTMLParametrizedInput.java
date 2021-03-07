package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field shortDescriptionHTML in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RepositoryShortDescriptionHTMLParametrizedInput implements GraphQLParametrizedInput {

    private Integer limit = 200;

    public RepositoryShortDescriptionHTMLParametrizedInput() {
    }

    public RepositoryShortDescriptionHTMLParametrizedInput(Integer limit) {
        this.limit = limit;
    }

    public RepositoryShortDescriptionHTMLParametrizedInput limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryShortDescriptionHTMLParametrizedInput that = (RepositoryShortDescriptionHTMLParametrizedInput) obj;
        return Objects.equals(limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit);
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
