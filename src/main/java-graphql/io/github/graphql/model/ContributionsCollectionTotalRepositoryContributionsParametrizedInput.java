package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field totalRepositoryContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
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
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst));
        }
        return joiner.toString();
    }

}
