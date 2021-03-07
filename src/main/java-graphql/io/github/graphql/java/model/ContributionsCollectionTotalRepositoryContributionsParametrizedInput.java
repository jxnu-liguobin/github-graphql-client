package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field totalRepositoryContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionsCollectionTotalRepositoryContributionsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean excludeFirst = false;

    public ContributionsCollectionTotalRepositoryContributionsParametrizedInput() {
    }

    public ContributionsCollectionTotalRepositoryContributionsParametrizedInput(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
    }

    public ContributionsCollectionTotalRepositoryContributionsParametrizedInput excludeFirst(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
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
        final ContributionsCollectionTotalRepositoryContributionsParametrizedInput that = (ContributionsCollectionTotalRepositoryContributionsParametrizedInput) obj;
        return Objects.equals(excludeFirst, that.excludeFirst);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeFirst);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst));
        }
        return joiner.toString();
    }

}
