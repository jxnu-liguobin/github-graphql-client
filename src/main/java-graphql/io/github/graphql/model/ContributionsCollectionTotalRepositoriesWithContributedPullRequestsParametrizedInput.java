package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field totalRepositoriesWithContributedPullRequests in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput implements GraphQLParametrizedInput {

    private Boolean excludeFirst = false;
    private Boolean excludePopular = false;

    public ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput() {
    }

    public ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput(Boolean excludeFirst, Boolean excludePopular) {
        this.excludeFirst = excludeFirst;
        this.excludePopular = excludePopular;
    }

    public ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput excludeFirst(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        return this;
    }

    public ContributionsCollectionTotalRepositoriesWithContributedPullRequestsParametrizedInput excludePopular(Boolean excludePopular) {
        this.excludePopular = excludePopular;
        return this;
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
