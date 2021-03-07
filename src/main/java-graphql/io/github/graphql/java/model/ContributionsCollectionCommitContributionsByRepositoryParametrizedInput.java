package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field commitContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionsCollectionCommitContributionsByRepositoryParametrizedInput implements GraphQLParametrizedInput {

    private Integer maxRepositories = 25;

    public ContributionsCollectionCommitContributionsByRepositoryParametrizedInput() {
    }

    public ContributionsCollectionCommitContributionsByRepositoryParametrizedInput(Integer maxRepositories) {
        this.maxRepositories = maxRepositories;
    }

    public ContributionsCollectionCommitContributionsByRepositoryParametrizedInput maxRepositories(Integer maxRepositories) {
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
        final ContributionsCollectionCommitContributionsByRepositoryParametrizedInput that = (ContributionsCollectionCommitContributionsByRepositoryParametrizedInput) obj;
        return Objects.equals(maxRepositories, that.maxRepositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxRepositories);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (maxRepositories != null) {
            joiner.add("maxRepositories: " + GraphQLRequestSerializer.getEntry(maxRepositories));
        }
        return joiner.toString();
    }

}
