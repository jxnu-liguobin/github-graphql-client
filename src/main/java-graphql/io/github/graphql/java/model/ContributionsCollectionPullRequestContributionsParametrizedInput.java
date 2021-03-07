package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;
import java.util.Objects;

/**
 * Parametrized input for field pullRequestContributions in type ContributionsCollection
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ContributionsCollectionPullRequestContributionsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String before;
    private Boolean excludeFirst = false;
    private Boolean excludePopular = false;
    private Integer first;
    private Integer last;
    private ContributionOrderTO orderBy;

    public ContributionsCollectionPullRequestContributionsParametrizedInput() {
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput(String after, String before, Boolean excludeFirst, Boolean excludePopular, Integer first, Integer last, ContributionOrderTO orderBy) {
        this.after = after;
        this.before = before;
        this.excludeFirst = excludeFirst;
        this.excludePopular = excludePopular;
        this.first = first;
        this.last = last;
        this.orderBy = orderBy;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput excludeFirst(Boolean excludeFirst) {
        this.excludeFirst = excludeFirst;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput excludePopular(Boolean excludePopular) {
        this.excludePopular = excludePopular;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public ContributionsCollectionPullRequestContributionsParametrizedInput orderBy(ContributionOrderTO orderBy) {
        this.orderBy = orderBy;
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
        final ContributionsCollectionPullRequestContributionsParametrizedInput that = (ContributionsCollectionPullRequestContributionsParametrizedInput) obj;
        return Objects.equals(after, that.after)
            && Objects.equals(before, that.before)
            && Objects.equals(excludeFirst, that.excludeFirst)
            && Objects.equals(excludePopular, that.excludePopular)
            && Objects.equals(first, that.first)
            && Objects.equals(last, that.last)
            && Objects.equals(orderBy, that.orderBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(after, before, excludeFirst, excludePopular, first, last, orderBy);
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
