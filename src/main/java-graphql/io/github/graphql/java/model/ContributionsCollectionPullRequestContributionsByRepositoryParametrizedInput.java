package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field pullRequestContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput implements GraphQLParametrizedInput {

    private Boolean excludeFirst = false;
    private Boolean excludePopular = false;
    private Integer maxRepositories = 25;

    public ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput() {
    }

    public ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput(Boolean excludeFirst, Boolean excludePopular, Integer maxRepositories) {
        this.excludeFirst = excludeFirst;
        this.excludePopular = excludePopular;
        this.maxRepositories = maxRepositories;
    }

    public ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput excludeFirst(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput excludePopular(Boolean excludePopular) {
        this.excludePopular = excludePopular;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput maxRepositories(Integer maxRepositories) {
        this.maxRepositories = maxRepositories;
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
        final ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput that = (ContributionsCollectionPullRequestContributionsByRepositoryParametrizedInput) obj;
        return Objects.equals(excludeFirst, that.excludeFirst)
            && Objects.equals(excludePopular, that.excludePopular)
            && Objects.equals(maxRepositories, that.maxRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeFirst, excludePopular, maxRepositories);
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
        if (maxRepositories != null) {
            joiner.add("maxRepositories: " + GraphQLRequestSerializer.getEntry(maxRepositories));
        }
        return joiner.toString();
    }

}
