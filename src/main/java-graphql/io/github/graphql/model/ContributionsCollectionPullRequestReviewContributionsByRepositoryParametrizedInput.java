package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field pullRequestReviewContributionsByRepository in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput implements GraphQLParametrizedInput {

    private Integer maxRepositories = 25;

    public ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput() {
    }

    public ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput(Integer maxRepositories) {
        this.maxRepositories = maxRepositories;
    }

    public ContributionsCollectionPullRequestReviewContributionsByRepositoryParametrizedInput maxRepositories(Integer maxRepositories) {
        this.maxRepositories = maxRepositories;
        return this;
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