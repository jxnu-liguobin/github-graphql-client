package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field contributions in type IssueContributionsByRepository
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueContributionsByRepositoryContributionsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Integer first;
    private Integer last;
    private ContributionOrderTO orderBy;

    public IssueContributionsByRepositoryContributionsParametrizedInput() {
    }

    public IssueContributionsByRepositoryContributionsParametrizedInput(String after, String before, Integer first, Integer last, ContributionOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public IssueContributionsByRepositoryContributionsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public IssueContributionsByRepositoryContributionsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public IssueContributionsByRepositoryContributionsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public IssueContributionsByRepositoryContributionsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public IssueContributionsByRepositoryContributionsParametrizedInput orderBy(ContributionOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        return joiner.toString();
    }

}
