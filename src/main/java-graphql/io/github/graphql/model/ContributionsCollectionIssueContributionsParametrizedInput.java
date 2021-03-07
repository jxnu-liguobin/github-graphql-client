package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field issueContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class ContributionsCollectionIssueContributionsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Boolean excludeFirst = false;
    private Boolean excludePopular = false;
    private Integer first;
    private Integer last;
    private ContributionOrderTO orderBy;

    public ContributionsCollectionIssueContributionsParametrizedInput() {
    }

    public ContributionsCollectionIssueContributionsParametrizedInput(String after, String before, Boolean excludeFirst, Boolean excludePopular, Integer first, Integer last, ContributionOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.excludeFirst = excludeFirst;
        this.excludePopular = excludePopular;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput excludeFirst(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        return this;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput excludePopular(Boolean excludePopular) {
        this.excludePopular = excludePopular;
        return this;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ContributionsCollectionIssueContributionsParametrizedInput orderBy(ContributionOrderTO orderBy) {
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
        if (excludeFirst != null) {
            joiner.add("excludeFirst: " + GraphQLRequestSerializer.getEntry(excludeFirst));
        }
        if (excludePopular != null) {
            joiner.add("excludePopular: " + GraphQLRequestSerializer.getEntry(excludePopular));
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
