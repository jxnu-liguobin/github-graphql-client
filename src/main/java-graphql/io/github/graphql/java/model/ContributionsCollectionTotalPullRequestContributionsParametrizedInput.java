package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field totalPullRequestContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionsCollectionTotalPullRequestContributionsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean excludeFirst = false;
    private Boolean excludePopular = false;

    public ContributionsCollectionTotalPullRequestContributionsParametrizedInput() {
    }

    public ContributionsCollectionTotalPullRequestContributionsParametrizedInput(Boolean excludeFirst, Boolean excludePopular) {
        this.excludeFirst = excludeFirst;
        this.excludePopular = excludePopular;
    }

    public ContributionsCollectionTotalPullRequestContributionsParametrizedInput excludeFirst(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        return this;
    }

    public ContributionsCollectionTotalPullRequestContributionsParametrizedInput excludePopular(Boolean excludePopular) {
        this.excludePopular = excludePopular;
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
        final ContributionsCollectionTotalPullRequestContributionsParametrizedInput that = (ContributionsCollectionTotalPullRequestContributionsParametrizedInput) obj;
        return Objects.equals(excludeFirst, that.excludeFirst)
            && Objects.equals(excludePopular, that.excludePopular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeFirst, excludePopular);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst));
        }
        if (excludePopular != null) {
            joiner.add("excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular));
        }
        return joiner.toString();
    }

}
