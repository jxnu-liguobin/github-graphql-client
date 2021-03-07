package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field release in type Repository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final RepositoryReleaseParametrizedInput that = (RepositoryReleaseParametrizedInput) obj;
        return Objects.equals(tagName, that.tagName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName);
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
